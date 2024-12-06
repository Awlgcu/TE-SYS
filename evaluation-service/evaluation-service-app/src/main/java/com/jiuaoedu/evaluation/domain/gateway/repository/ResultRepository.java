package com.jiuaoedu.evaluation.domain.gateway.repository;

import com.jiuaoedu.evaluation.domain.aggregate.EvaluationResult;
import com.jiuaoedu.evaluation.pojo.dto.EvaluationResultDTO;
import com.jiuaoedu.share.BaseRepository;

import java.util.List;

/**
 * @description: result仓储接口,除了基本的仓储方法还定义了几个特殊查询
 * @author: Rick
 * @date: 2024/12/4 14:10
 * @version: 1.0
 */

public interface ResultRepository extends BaseRepository<EvaluationResult, Long> {
    //定义的都是直接返回DTO的方法,引入了一个包自动生成转换器实现类型转换

    List<EvaluationResult> findAllByStudentId(Long studentId);
    List<EvaluationResult> findAllByTeacherId(Long teacherId);
}
