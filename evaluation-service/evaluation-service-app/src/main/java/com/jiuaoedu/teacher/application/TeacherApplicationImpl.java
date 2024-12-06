package com.jiuaoedu.teacher.application;

import com.jiuaoedu.teacher.pojo.cmd.TeacherCreate;
import com.jiuaoedu.teacher.pojo.cmd.TeacherUpdate;
import com.jiuaoedu.teacher.domain.aggregate.Teacher;
import com.jiuaoedu.teacher.domain.gateway.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 18:01
 * @version: 1.0
 */

@Service
public class TeacherApplicationImpl implements TeacherApplication {
    @Resource
    private TeacherRepository teacherRepository;
    @Override
    public void addTeacher(TeacherCreate cmd) {
        Teacher teacher = new Teacher();
        teacher.setAge(cmd.getAge());
        teacher.setPassword(cmd.getPassword());
        teacher.setGender(cmd.getGender());
        teacher.setUsername(cmd.getUsername());
        teacherRepository.save(teacher);
    }

    @Override
    public void updateTeacher(TeacherUpdate cmd) {
        Teacher teacher = teacherRepository.findById(cmd.getId()).get();
        teacher.setUsername(cmd.getUsername());
        teacher.setPassword(cmd.getPassword());
        teacher.setAge(cmd.getAge());
        teacher.setGender(cmd.getGender());
        teacherRepository.save(teacher);
    }

    @Override
    public void deleteTeacher(Long id) {
        Teacher teacher = teacherRepository.findById(id).get();
        teacherRepository.delete(teacher);
    }


}
