package com.jiuaoedu.evaluation.application;

import com.jiuaoedu.evaluation.domain.aggregate.Indicator;
import com.jiuaoedu.evaluation.domain.aggregate.enums.IndicatorType;
import com.jiuaoedu.evaluation.domain.factory.IndicatorFactory;
import com.jiuaoedu.evaluation.domain.gateway.repository.IndicatorRepository;
import com.jiuaoedu.evaluation.domain.service.IndicatorEditChoiceService;
import com.jiuaoedu.evaluation.pojo.cmd.ChoiceCreate;
import com.jiuaoedu.evaluation.pojo.cmd.ChoiceRemove;
import com.jiuaoedu.evaluation.pojo.cmd.IndicatorCreate;
import com.jiuaoedu.evaluation.pojo.cmd.IndicatorModify;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/3 15:13
 * @version: 1.0
 */
@Service
public class IndicatorApplicationImpl implements IndicatorApplication {
    @Resource
    private IndicatorRepository indicatorRepository;
    @Resource
    private IndicatorEditChoiceService indicatorEditChoiceService;


    @Override
    public void addIndicator(IndicatorCreate cmd) {
        Indicator indicator = IndicatorFactory.create(cmd);
        indicatorRepository.save(indicator);
    }

    @Override
    public void removeIndicator(Long id) {
        //删除时先查再删
        Indicator indicator = indicatorRepository.findById(id).get();
        indicatorRepository.delete(indicator);
    }

    @Override
    public void updateIndicator(IndicatorModify cmd) {
        //更新是先根据id找到原来的指标,再修改值
        Indicator indicator = indicatorRepository.findById(cmd.getId()).get();

        indicator.modifyDescription(cmd.getDescription());
        IndicatorType type = IndicatorType.getIndicatorType(cmd.getTypeIndex());
        indicator.modifyType(type);
        indicatorRepository.save(indicator);
    }

    @Override
    public void addChoice(ChoiceCreate cmd) {
        indicatorEditChoiceService.addChoice(cmd);
    }

    @Override
    public void removeChoice(ChoiceRemove cmd) {
        indicatorEditChoiceService.removeChoice(cmd);

    }
}
