package com.jiuaoedu.evaluation.domain.aggregate;

import com.jiuaoedu.share.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/3 16:29
 * @version: 1.0
 */
@Entity
public class Choice extends AbstractEntity {
    private String value;

    @ManyToOne
    @JoinColumn(name = "indicator_id", referencedColumnName = "id", foreignKey = @ForeignKey(name="null"))
    private Indicator indicator;

    public Choice(Indicator indicator, String value) {
        this.indicator = indicator;
        this.value = value;
    }
    public Choice(){}

    @Override
    public String toString() {
        return this.value;
    }

    //解除和indicator的约束关系
    public void detach(){
        this.indicator = null;
    }

    public String getValue() {
        return value;
    }


    public Indicator getIndicator() {
        return indicator;
    }

    public void setIndicator(Indicator indicator) {
        this.indicator = indicator;
    }
    public void setValue(String value) {
        this.value = value;
    }
}
