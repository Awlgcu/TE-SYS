package com.jiuaoedu.student.application;

import com.jiuaoedu.student.domain.aggregate.Address;
import com.jiuaoedu.student.pojo.cmd.StudentCreate;
import com.jiuaoedu.student.pojo.cmd.StudentUpdate;
import com.jiuaoedu.student.pojo.cmd.TeacherEdit;
import com.jiuaoedu.student.domain.aggregate.Student;
import com.jiuaoedu.student.domain.aggregate.TeacherSource;
import com.jiuaoedu.student.domain.gateway.repository.StudentRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.Optional;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 18:01
 * @version: 1.0
 */

@Service
public class StudentApplicationImpl implements StudentApplication {
    @Resource
    private StudentRepository studentRepository;
    @Override
    public void addStudent(StudentCreate cmd) {
        Student student = new Student();
        student.setAge(cmd.getAge());
        student.setPassword(cmd.getPassword());
        student.setGender(cmd.getGender());
        student.setUsername(cmd.getUsername());
        studentRepository.save(student);
    }

    @Override
    public void updateStudent(StudentUpdate cmd) {
        Student student = studentRepository.findById(cmd.getId()).get();
        student.setUsername(cmd.getUsername());
        student.setPassword(cmd.getPassword());
        student.setAge(cmd.getAge());
        student.setGender(cmd.getGender());
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        Student student = studentRepository.findById(id).get();
        studentRepository.delete(student);
    }

    @Override
    public void addTeacher(TeacherEdit cmd) {
        Student student = studentRepository.findById(cmd.getStudentId()).get();
        TeacherSource teacherSource = new TeacherSource(cmd.getTeacherId());
        //建立双向绑定关系
        teacherSource.setStudent(student);
        student.addTeacher(teacherSource);
        //别忘了save
        studentRepository.save(student);
    }

    @Override
    public void removeTeacher(TeacherEdit cmd) {
        Student student = studentRepository.findById(cmd.getStudentId()).get();
        Iterator<TeacherSource> iterator = student.getTeachers().iterator();
        while(iterator.hasNext()) {
            TeacherSource teacherSource = iterator.next();
            if (teacherSource.getTeacherId().equals(cmd.getTeacherId())) {
                teacherSource.detach();
            }
        }
        //别忘了save更新student
        studentRepository.save(student);
    }

    @Override
    public void addAddress(Long id) {
        Student student = studentRepository.findById(id).get();
        Address address = new Address();
        address.setCity("chengdu");
        address.setProvince("sichuan");
        address.setDistrict("shuangliu");
        student.setAddress(address);
        //记得更新!
        studentRepository.save(student);

    }
}
