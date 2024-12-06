package com.jiuaoedu.student.infrastracture.assembler;

import com.jiuaoedu.student.pojo.dto.StudentAll;
import com.jiuaoedu.share.ListToString;
import com.jiuaoedu.student.domain.aggregate.Student;
import com.jiuaoedu.student.domain.aggregate.TeacherSource;
import com.jiuaoedu.teacher.api.TeacherApi;
import com.jiuaoedu.teacher.pojo.dto.TeacherDTO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/5 9:37
 * @version: 1.0
 */
@Component
public class StudentAllAssembler {
    //注入老师接口,根据id查询老师DTO
    @Resource
    private TeacherApi teacherApi;

    public StudentAll assemble(Student student) {
        StudentAll studentAll = new StudentAll();
        studentAll.setUsername(student.getUsername());
        studentAll.setAge(student.getAge());
        studentAll.setGender(student.getGender());
        studentAll.setPassword(student.getPassword());
        studentAll.setId(student.getId());
        List<TeacherSource> teachers = student.getTeachers();

        //需要根据学生存的老师id查详细的老师信息!!!调用TeacherApi!!!
        List<Long> teacherIds = teachers.stream().map(TeacherSource::getTeacherId).collect(Collectors.toList());
        List<TeacherDTO> teacherDTOS = teacherApi.findByIds(teacherIds);
        studentAll.setTeachers(teacherDTOS);
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
