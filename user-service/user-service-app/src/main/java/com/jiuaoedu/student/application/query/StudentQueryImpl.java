package com.jiuaoedu.student.application.query;

import com.jiuaoedu.pojo.dto.StudentAll;
import com.jiuaoedu.pojo.dto.StudentDTO;
import com.jiuaoedu.student.domain.aggregate.Student;
import com.jiuaoedu.student.domain.gateway.repository.StudentRepository;
import com.jiuaoedu.student.infrastracture.assembler.StudentAllAssembler;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 18:00
 * @version: 1.0
 */
@Service
public class StudentQueryImpl implements StudentQuery {
    @Resource
    private StudentRepository studentRepository;

    @Resource
    private StudentAllAssembler studentAllAssembler;

    @Override
    public List<StudentDTO> findAll() {
        return studentRepository.findAllDTO();
    }

    @Override
    public StudentAll findById(Long id) {
        Student student = studentRepository.findById(id).get();
        return studentAllAssembler.assemble(student);
    }

    @Override
    public List<StudentAll> findByNameLike(String name) {
        List<Student> students = studentRepository.findByNameLike(name);
        return studentAllAssembler.assembleAll(students);
    }
}
