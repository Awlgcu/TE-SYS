package com.jiuaoedu.evaluation.pojo.cmd;

import javax.validation.constraints.*;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/3 14:38
 * @version: 1.0
 */

public class IndicatorCreate {
    @NotNull
    private String description;
    @NotNull
    private Integer typeIndex;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTypeIndex() {
        return typeIndex;
    }

    public void setTypeIndex(Integer typeIndex) {
        this.typeIndex = typeIndex;
    }
}
