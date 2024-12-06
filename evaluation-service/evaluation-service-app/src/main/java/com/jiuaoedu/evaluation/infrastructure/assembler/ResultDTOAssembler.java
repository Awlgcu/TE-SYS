package com.jiuaoedu.evaluation.infrastructure.assembler;

import com.jiuaoedu.evaluation.api.IndicatorApi;
import com.jiuaoedu.evaluation.domain.aggregate.EvaluationResult;
import com.jiuaoedu.evaluation.pojo.dto.EvaluationResultDTO;
import com.jiuaoedu.evaluation.pojo.dto.IndicatorDTO;
import com.jiuaoedu.student.api.StudentApi;
import com.jiuaoedu.student.domain.aggregate.Student;
import com.jiuaoedu.student.pojo.dto.StudentAll;
import com.jiuaoedu.teacher.api.TeacherApi;
import com.jiuaoedu.teacher.pojo.dto.TeacherAll;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 得到详细评价结果的转换器,需要依靠其他领域
 * @author: Rick
 * @date: 2024/12/6 9:53
 * @version: 1.0
 */

@Component
public class ResultDTOAssembler {
    @Resource
    private TeacherApi teacherApi;
    @Resource
    private StudentApi studentApi;
    @Resource
    private IndicatorApi indicatorApi;

    public EvaluationResultDTO assemble(EvaluationResult result) {
        EvaluationResultDTO dto = new EvaluationResultDTO();
        dto.setResult(result.getResult());
        dto.setIndicatorId(result.getIndicatorId());
        dto.setStudentId(result.getStudentId());
        dto.setTeacherId(result.getTeacherId());

        TeacherAll teacher = teacherApi.findById(result.getTeacherId());
        dto.setTeacherName(teacher.getUsername());

        StudentAll student = studentApi.findById(result.getStudentId());
        dto.setStudentName(student.getUsername());

        IndicatorDTO indicator = indicatorApi.getOne(result.getIndicatorId());
        dto.setIndicatorDescription(indicator.getDescription());
        return dto;
    }
    public List<EvaluationResultDTO> assembleAll(List<EvaluationResult> results) {
        ArrayList<EvaluationResultDTO> dtos = new ArrayList<>();
        for (EvaluationResult result : results) {
            dtos.add(assemble(result));
        }
        return dtos;
    }
}
