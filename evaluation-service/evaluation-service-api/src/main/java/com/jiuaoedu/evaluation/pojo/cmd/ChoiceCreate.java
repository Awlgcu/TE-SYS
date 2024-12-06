package com.jiuaoedu.evaluation.pojo.cmd;
import javax.validation.constraints.*;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/3 16:50
 * @version: 1.0
 */

public class ChoiceCreate {
    @NotNull
    private String value;
    @NotNull
    private Long indicatorId;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getIndicatorId() {
        return indicatorId;
    }

    public void setIndicatorId(Long indicatorId) {
        this.indicatorId = indicatorId;
    }
}
