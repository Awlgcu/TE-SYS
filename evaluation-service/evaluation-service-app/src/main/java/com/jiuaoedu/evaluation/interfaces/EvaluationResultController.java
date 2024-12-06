package com.jiuaoedu.evaluation.interfaces;

import com.jiuaoedu.evaluation.api.ResultApi;
import com.jiuaoedu.evaluation.application.EvaluationResultApplicationImpl;
import com.jiuaoedu.evaluation.application.query.EvaluationResultQueryImpl;
import com.jiuaoedu.evaluation.domain.aggregate.EvaluationResult;
import com.jiuaoedu.evaluation.pojo.cmd.ResultCreate;
import com.jiuaoedu.evaluation.pojo.dto.EvaluationResultDTO;
import org.jetbrains.annotations.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 14:36
 * @version: 1.0
 */

@RestController
@RequestMapping("/result")
public class EvaluationResultController implements ResultApi {

    @Resource
    private EvaluationResultApplicationImpl evaluationResultApplication;
    @Resource
    private EvaluationResultQueryImpl evaluationResultQuery;


    @Override
    @PostMapping("/create")
    public void add(@RequestBody @Validated ResultCreate cmd) {
        evaluationResultApplication.createResult(cmd);
    }

    @DeleteMapping("/remove")
    @Override
    public void remove(@NotNull Long id) {
        evaluationResultApplication.deleteResult(id);
    }

    @GetMapping("/get/oneById")
    @Override
    public EvaluationResultDTO getOne(@NotNull Long id) {
        return evaluationResultQuery.getById(id);
    }

    @GetMapping("/get/all")
    @Override
    public List<EvaluationResultDTO> getAll() {
        return evaluationResultQuery.getAll();
    }

    @GetMapping("/get/byStudentId")
    @Override
    public List<EvaluationResultDTO> getByStudentId(@NotNull Long studentId) {
        return evaluationResultQuery.getByStudentId(studentId);
    }

    @GetMapping("/get/byTeacherId")
    @Override
    public List<EvaluationResultDTO> getByTeacherId(@NotNull Long teacherId) {
        return evaluationResultQuery.getByTeacherId(teacherId);
    }
}
