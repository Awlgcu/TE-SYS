package com.jiuaoedu.evaluation.application;

import com.jiuaoedu.evaluation.domain.aggregate.EvaluationResult;
import com.jiuaoedu.evaluation.domain.gateway.repository.ResultRepository;
import com.jiuaoedu.evaluation.pojo.cmd.ResultCreate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 15:04
 * @version: 1.0
 */

@Service
public class EvaluationResultApplicationImpl implements EvaluationResultApplication {
    @Resource
    private ResultRepository resultRepository;

    @Override
    public void deleteResult(Long id) {
        EvaluationResult result = resultRepository.findById(id).get();
        resultRepository.delete(result);
    }

    @Override
    public void createResult(ResultCreate cmd) {
        EvaluationResult evaluationResult = new EvaluationResult();
        evaluationResult.setResult(cmd.getResult());
        evaluationResult.setIndicatorId(cmd.getIndicatorId());
        evaluationResult.setStudentId(cmd.getStudentId());
        evaluationResult.setTeacherId(cmd.getTeacherId());

        resultRepository.save(evaluationResult);
    }
}
