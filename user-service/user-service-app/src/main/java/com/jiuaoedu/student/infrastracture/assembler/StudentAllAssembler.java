package com.jiuaoedu.student.infrastracture.assembler;

import com.jiuaoedu.pojo.dto.StudentAll;
import com.jiuaoedu.share.ListToString;
import com.jiuaoedu.student.domain.aggregate.Student;
import com.jiuaoedu.student.domain.aggregate.TeacherSource;
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
public class StudentAllAssembler {
    public StudentAll assemble(Student student) {
        StudentAll studentAll = new StudentAll();
        studentAll.setUsername(student.getUsername());
        studentAll.setAge(student.getAge());
        studentAll.setGender(student.getGender());
        studentAll.setPassword(student.getPassword());
        studentAll.setId(student.getId());
        List<TeacherSource> teachers = student.getTeachers();
        studentAll.setTeachers(ListToString.transfer(teachers));
        return studentAll;
    }
    public List<StudentAll> assembleAll(List<Student> students) {
        List<StudentAll> studentAlls = new ArrayList<>();
        for (Student student : students) {
            studentAlls.add(assemble(student));
        }
        return studentAlls;
    }
}
