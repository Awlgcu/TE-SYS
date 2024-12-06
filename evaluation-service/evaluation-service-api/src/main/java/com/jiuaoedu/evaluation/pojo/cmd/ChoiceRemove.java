package com.jiuaoedu.evaluation.pojo.cmd;
import javax.validation.constraints.*;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/3 17:05
 * @version: 1.0
 */

public class ChoiceRemove {
    @NotNull
    @Digits(integer = 8, fraction = 0)
    private Long choiceId;

    @NotNull
    @Digits(integer = 8, fraction = 0)
    private Long indicatorId;

    public Long getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(Long choiceId) {
        this.choiceId = choiceId;
    }

    public Long getIndicatorId() {
        return indicatorId;
    }

    public void setIndicatorId(Long indicatorId) {
        this.indicatorId = indicatorId;
    }
}
