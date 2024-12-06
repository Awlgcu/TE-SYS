package com.jiuaoedu.evaluation.api;

import com.jiuaoedu.evaluation.pojo.cmd.ResultCreate;
import com.jiuaoedu.evaluation.pojo.dto.EvaluationResultDTO;
import org.jetbrains.annotations.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 14:23
 * @version: 1.0
 */

@RequestMapping("/result")
public interface ResultApi {
    @PostMapping("/create")
    void add(@RequestBody @Validated ResultCreate cmd);
    @DeleteMapping("/remove")
    void remove(@RequestParam @NotNull Long id);

    @GetMapping("/get/oneById")
    EvaluationResultDTO getOne(@NotNull Long id);

    @GetMapping("/get/all")
    List<EvaluationResultDTO> getAll();

    @GetMapping("/get/byStudentId")
    List<EvaluationResultDTO> getByStudentId(@RequestParam @NotNull Long studentId);

    @GetMapping("/get/byTeacherId")
    List<EvaluationResultDTO> getByTeacherId(@RequestParam @NotNull Long teacherId);
}
