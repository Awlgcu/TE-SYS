package com.jiuaoedu.evaluation.domain.aggregate.enums;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/3 12:08
 * @version: 1.0
 */

public enum IndicatorType {
    CHOICE("选择题", 1), MULTIPLE_CHOICE("多选题", 2);
    private String value;
    private int index;
    IndicatorType(String value, int index) {
        this.value = value;
        this.index = index;
    }
    @Override
    public String toString(){
        return this.value;
    }

    public static IndicatorType getIndicatorType(int index){
        switch (index){
            case 1:
                return CHOICE;
            case 2:
                return MULTIPLE_CHOICE;
            default:
                return null;

        }
    }
    public static String getOriginalString(int index){
        switch (index){
            case 1:
                return "CHOICE";
            case 2:
                return "MULTIPLE_CHOICE";
            default:
                return null;

        }
    }
}
