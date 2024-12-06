package com.jiuaoedu.evaluation.infrastructure.repository.jpa;

import com.jiuaoedu.evaluation.domain.aggregate.EvaluationResult;
import com.jiuaoedu.evaluation.pojo.dto.EvaluationResultDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @description: result的jpa仓库,主要都是一些自动转换成DTO的查询
 * @author: Rick
 * @date: 2024/12/4 14:15
 * @version: 1.0
 */

public interface ResultJpaRepository extends JpaRepository<EvaluationResult, Long> {
    @Query(nativeQuery = true, value = "select * from evaluation_result where student_id=:student_id")
    List<EvaluationResult> findAllByStudentId(@Param("student_id") Long studentId);
    @Query(nativeQuery = true, value = "select * from evaluation_result where teacher_id=:teacher_id")
    List<EvaluationResult> findAllByTeacherId(@Param("teacher_id") Long teacherId);

}
