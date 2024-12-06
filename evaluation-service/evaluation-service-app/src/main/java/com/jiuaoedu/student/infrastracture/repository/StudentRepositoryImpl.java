package com.jiuaoedu.student.infrastracture.repository;

import com.jiuaoedu.student.pojo.dto.StudentDTO;
import com.jiuaoedu.student.domain.aggregate.Student;
import com.jiuaoedu.student.domain.gateway.repository.StudentRepository;
import com.jiuaoedu.student.infrastracture.repository.jpa.StudentJpaRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 16:25
 * @version: 1.0
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    @Resource
    private StudentJpaRepository jpaRepository;

    @Override
    public Optional<Student> findById(Long id) {
        return jpaRepository.findById(id);
    }

    @Override
    public Student save(Student student) {
        return jpaRepository.save(student);
    }

    @Override
    public Student saveAndFlush(Student student) {
        return jpaRepository.saveAndFlush(student);
    }

    @Override
    public List<Student> saveAll(List<Student> students) {
        return jpaRepository.saveAll(students);
    }

    @Override
    public List<Student> findAll() {
        return jpaRepository.findAll();
    }

    @Override
    public void delete(Student student) {
        jpaRepository.delete(student);
    }

    @Override
    public List<Student> findByIdIn(List<Long> ids) {
        return jpaRepository.findAllById(ids);
    }

    @Override
    public List<StudentDTO> findAllDTO() {
        return jpaRepository.findAllDTO();
    }

    @Override
    public List<Student> findByNameLike(String name) {
        return jpaRepository.findByNameLike(name);
    }
}
