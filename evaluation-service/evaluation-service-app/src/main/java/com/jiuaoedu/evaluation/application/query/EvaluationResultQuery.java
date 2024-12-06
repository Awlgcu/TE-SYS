package com.jiuaoedu.evaluation.application.query;

import com.jiuaoedu.evaluation.pojo.dto.EvaluationResultDTO;

import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 14:36
 * @version: 1.0
 */

public interface EvaluationResultQuery {
    List<EvaluationResultDTO> getAll();
    List<EvaluationResultDTO> getByStudentId(Long studentId);
    List<EvaluationResultDTO> getByTeacherId(Long teacherId);
    EvaluationResultDTO getById(Long id);

}
