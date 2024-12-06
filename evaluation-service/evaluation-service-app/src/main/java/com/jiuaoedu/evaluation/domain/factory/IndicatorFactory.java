package com.jiuaoedu.evaluation.domain.factory;

import com.jiuaoedu.evaluation.domain.aggregate.Indicator;
import com.jiuaoedu.evaluation.domain.aggregate.enums.IndicatorType;
import com.jiuaoedu.evaluation.pojo.cmd.IndicatorCreate;

/**
 * @description:根据cmd类生成Indicatory实例的工厂
 * @author: Rick
 * @date: 2024/12/3 15:22
 * @version: 1.0
 */

public class IndicatorFactory {
    public static Indicator create(IndicatorCreate cmd){
        Indicator indicator = new Indicator();
        indicator.setDescription(cmd.getDescription());
        indicator.setType(IndicatorType.getIndicatorType(cmd.getTypeIndex()));
        return indicator;
    }
}
