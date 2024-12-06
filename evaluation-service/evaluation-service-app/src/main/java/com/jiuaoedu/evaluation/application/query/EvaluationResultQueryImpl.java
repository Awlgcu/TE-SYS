package com.jiuaoedu.evaluation.application.query;

import com.jiuaoedu.evaluation.domain.aggregate.EvaluationResult;
import com.jiuaoedu.evaluation.domain.gateway.repository.ResultRepository;
import com.jiuaoedu.evaluation.infrastructure.assembler.ResultDTOAssembler;
import com.jiuaoedu.evaluation.pojo.dto.EvaluationResultDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 14:55
 * @version: 1.0
 */
@Service
public class EvaluationResultQueryImpl implements EvaluationResultQuery {
    @Resource
    private ResultRepository resultRepository;
    @Resource
    private ResultDTOAssembler resultDTOAssembler;

    @Override
    public List<EvaluationResultDTO> getAll() {
        List<EvaluationResult> results = resultRepository.findAll();
        return resultDTOAssembler.assembleAll(results);
    }

    @Override
    public List<EvaluationResultDTO> getByStudentId(Long studentId) {
        List<EvaluationResult> results = resultRepository.findAllByStudentId(studentId);
        return resultDTOAssembler.assembleAll(results);
    }

    @Override
    public List<EvaluationResultDTO> getByTeacherId(Long teacherId) {
        List<EvaluationResult> results = resultRepository.findAllByTeacherId(teacherId);
        return resultDTOAssembler.assembleAll(results);
    }

    @Override
    public EvaluationResultDTO getById(Long id) {
        EvaluationResult result = resultRepository.findById(id).get();
        return resultDTOAssembler.assemble(result);
    }
}
