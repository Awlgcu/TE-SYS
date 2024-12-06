package com.jiuaoedu.teacher.infrastructure.assembler;

import com.jiuaoedu.teacher.domain.aggregate.Teacher;
import com.jiuaoedu.teacher.pojo.dto.TeacherDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/5 17:54
 * @version: 1.0
 */

@Component
public class TeacherDTOAssembler {
    public TeacherDTO assemble(Teacher teacher) {
        TeacherDTO teacherDTO = new TeacherDTO();
        teacherDTO.setId(teacher.getId());
        teacherDTO.setAge(teacher.getAge());
        teacherDTO.setGender(teacher.getGender());
        teacherDTO.setUsername(teacher.getUsername());
        return teacherDTO;
    }
    public List<TeacherDTO> assembleAll(List<Teacher> teachers) {
        List<TeacherDTO> teacherDTOS = new ArrayList<>();
        for (Teacher teacher : teachers) {
            teacherDTOS.add(assemble(teacher));
        }
        return teacherDTOS;
    }
}
