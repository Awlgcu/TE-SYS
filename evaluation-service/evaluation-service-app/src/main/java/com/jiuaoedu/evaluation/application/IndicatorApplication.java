package com.jiuaoedu.evaluation.application;

import com.jiuaoedu.evaluation.pojo.cmd.ChoiceCreate;
import com.jiuaoedu.evaluation.pojo.cmd.ChoiceRemove;
import com.jiuaoedu.evaluation.pojo.cmd.IndicatorCreate;
import com.jiuaoedu.evaluation.pojo.cmd.IndicatorModify;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/3 14:33
 * @version: 1.0
 */

public interface IndicatorApplication {

    void addIndicator(IndicatorCreate cmd);
    void removeIndicator(Long id);
    void updateIndicator(IndicatorModify cmd);

    void addChoice(ChoiceCreate cmd);

    void removeChoice(ChoiceRemove cmd);
}
