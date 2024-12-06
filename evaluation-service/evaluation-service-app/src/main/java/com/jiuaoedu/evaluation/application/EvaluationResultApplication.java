package com.jiuaoedu.evaluation.application;

import com.jiuaoedu.evaluation.pojo.cmd.ResultCreate;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 14:35
 * @version: 1.0
 */

public interface EvaluationResultApplication {
    void deleteResult(Long id);
    void createResult(ResultCreate cmd);
}
