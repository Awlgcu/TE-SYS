package com.jiuaoedu.evaluation.pojo.cmd;

import javax.validation.constraints.*;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/3 15:03
 * @version: 1.0
 */

public class IndicatorModify {
    @NotNull
    private Long id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
