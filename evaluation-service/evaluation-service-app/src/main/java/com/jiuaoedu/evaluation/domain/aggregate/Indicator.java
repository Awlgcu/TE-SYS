package com.jiuaoedu.evaluation.domain.aggregate;

import com.jiuaoedu.evaluation.domain.aggregate.enums.IndicatorType;
import com.jiuaoedu.share.AbstractEntity;

import javax.persistence.*;
import java.util.List;

/**
 * @description: 评价指标的聚合根
 * @author: Rick
 * @date: 2024/12/3 12:05
 * @version: 1.0
 */

@Entity
@Table(name = "indicator")
public class Indicator extends AbstractEntity {

    private String description;

    @Enumerated(value = EnumType.STRING)
    private IndicatorType type;

    //可以所有级联删除,因为选项必须依赖指标存在
    @OneToMany(mappedBy = "indicator", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Choice> choices;

    public String getDescription() {
        return description;
    }


    public IndicatorType getType() {
        return type;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setType(IndicatorType type) {
        this.type = type;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }
    public List<Choice> getChoices() {
        return choices;
    }

    /**
     * 领域行为,修改问题描述
     * @param description
     */
    public void modifyDescription(String description) {
        this.description = description;
    }

    /**
     * 领域行为,修改问题类型
     * @param type
     */
    public void modifyType(IndicatorType type) {
        this.type = type;
    }

    /**
     * 领域行为,给指标添加选项
     */
    public void addChoice(Choice choice) {
        this.choices.add(choice);
    }


    /**
     * 领域行为,删除选项
     * @param choice
     */
    public void removeChoice(Choice choice) {
        this.choices.remove(choice);
    }
}
