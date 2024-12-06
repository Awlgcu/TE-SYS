package com.jiuaoedu.evaluation.infrastructure.repository;

import com.jiuaoedu.evaluation.domain.aggregate.EvaluationResult;
import com.jiuaoedu.evaluation.domain.gateway.repository.ResultRepository;
import com.jiuaoedu.evaluation.infrastructure.repository.jpa.ResultJpaRepository;
import com.jiuaoedu.evaluation.pojo.dto.EvaluationResultDTO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 14:13
 * @version: 1.0
 */

@Repository
public class ResultRepositoryImpl implements ResultRepository {
    @Resource
    private ResultJpaRepository resultJpaRepository;

    @Override
    public Optional<EvaluationResult> findById(Long id) {
        return resultJpaRepository.findById(id);
    }

    @Override
    public EvaluationResult save(EvaluationResult evaluationResult) {
        return resultJpaRepository.save(evaluationResult);
    }

    @Override
    public EvaluationResult saveAndFlush(EvaluationResult evaluationResult) {
        return resultJpaRepository.saveAndFlush(evaluationResult);
    }

    @Override
    public List<EvaluationResult> saveAll(List<EvaluationResult> evaluationResults) {
        return resultJpaRepository.saveAll(evaluationResults);
    }

    @Override
    public List<EvaluationResult> findAll() {
        return resultJpaRepository.findAll();
    }

    @Override
    public void delete(EvaluationResult evaluationResult) {
        resultJpaRepository.delete(evaluationResult);
    }

    @Override
    public List<EvaluationResult> findByIdIn(List<Long> ids) {
        return resultJpaRepository.findAllById(ids);
    }


    @Override
    public List<EvaluationResult> findAllByStudentId(Long studentId) {
        return resultJpaRepository.findAllByStudentId(studentId);
    }

    @Override
    public List<EvaluationResult> findAllByTeacherId(Long teacherId) {
        return resultJpaRepository.findAllByTeacherId(teacherId);
    }


}
