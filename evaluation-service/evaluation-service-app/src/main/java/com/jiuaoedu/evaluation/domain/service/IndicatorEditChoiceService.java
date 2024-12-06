package com.jiuaoedu.evaluation.domain.service;

import com.jiuaoedu.evaluation.domain.aggregate.Choice;
import com.jiuaoedu.evaluation.domain.aggregate.Indicator;
import com.jiuaoedu.evaluation.domain.gateway.repository.ChoiceRepository;
import com.jiuaoedu.evaluation.domain.gateway.repository.IndicatorRepository;
import com.jiuaoedu.evaluation.pojo.cmd.ChoiceCreate;
import com.jiuaoedu.evaluation.pojo.cmd.ChoiceRemove;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description: "多个聚合对象完成的任务" 放在domain的service层而不是和domain同级的application层
 * @author: Rick
 * @date: 2024/12/4 10:21
 * @version: 1.0
 */

@Service
public class IndicatorEditChoiceService {
    @Resource
    private ChoiceRepository choiceRepository;
    @Resource
    private IndicatorRepository indicatorRepository;

    public void addChoice(ChoiceCreate cmd){
        //一对多的关系,要双向绑定
        Indicator indicator = indicatorRepository.findById(cmd.getIndicatorId()).get();
        Choice choice = new Choice();
        choice.setValue(cmd.getValue());
        choice.setIndicator(indicator);
        indicator.addChoice(choice);
        //记得更新指标
        indicatorRepository.save(indicator);
        //这里不能再save选项了!!!
        //jpa在new choice时就已经生成了一行数据了,再save会多一行
        //并且由于级联更新,indicator save的时候就更新了choice了
       // choiceRepository.save(choice);
    }
    public void removeChoice(ChoiceRemove cmd){
        //一对多的关系,要双向解绑

        //通过for循环找到目标选项并操作
//        Indicator indicator = indicatorRepository.findById(cmd.getIndicatorId()).get();
//        List<Choice> choices = indicator.getChoices();
//        for (Choice choice : choices) {
//            if (choice.getId().equals(cmd.getChoiceId())){
//                choice.detach();
//                choices.remove(choice);
//                //双方都要更新!!!
//                choiceRepository.save(choice);
//                indicatorRepository.save(indicator);
//                break;
//            }
//        }

        //有Choice仓库和choiceId,所以直接删除,不用for循环查找,但也要更新
        Indicator indicator = indicatorRepository.findById(cmd.getIndicatorId()).get();
        Choice choice = choiceRepository.findById(cmd.getChoiceId()).get();
        indicator.removeChoice(choice);
        choice.detach();
//        记得更新指标和选项!!!
        indicatorRepository.save(indicator);
        choiceRepository.save(choice);
    }
}
