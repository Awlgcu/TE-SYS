package com.jiuaoedu.teacher.infrastructure.assembler;

import com.jiuaoedu.teacher.pojo.dto.TeacherAll;
import com.jiuaoedu.teacher.domain.aggregate.Teacher;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/5 9:37
 * @version: 1.0
 */
@Component
public class TeacherAllAssembler {
    public TeacherAll assemble(Teacher teacher) {
        TeacherAll teacherAll = new TeacherAll();
        teacherAll.setUsername(teacher.getUsername());
        teacherAll.setAge(teacher.getAge());
        teacherAll.setGender(teacher.getGender());
        teacherAll.setPassword(teacher.getPassword());
        teacherAll.setId(teacher.getId());
        return teacherAll;
    }
    public List<TeacherAll> assembleAll(List<Teacher> teachers) {
        List<TeacherAll> teacherAlls = new ArrayList<>();
        for (Teacher teacher : teachers) {
            teacherAlls.add(assemble(teacher));
        }
        return teacherAlls;
    }
}
