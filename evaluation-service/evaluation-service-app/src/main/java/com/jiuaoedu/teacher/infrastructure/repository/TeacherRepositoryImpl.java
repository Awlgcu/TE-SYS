package com.jiuaoedu.teacher.infrastructure.repository;

import com.jiuaoedu.teacher.pojo.dto.TeacherDTO;
import com.jiuaoedu.teacher.domain.aggregate.Teacher;
import com.jiuaoedu.teacher.domain.gateway.repository.TeacherRepository;
import com.jiuaoedu.teacher.infrastructure.repository.jpa.TeacherJpaRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 16:25
 * @version: 1.0
 */
@Repository
public class TeacherRepositoryImpl implements TeacherRepository {
    @Resource
    private TeacherJpaRepository jpaRepository;

    @Override
    public Optional<Teacher> findById(Long id) {
        return jpaRepository.findById(id);
    }

    @Override
    public Teacher save(Teacher teacher) {
        return jpaRepository.save(teacher);
    }

    @Override
    public Teacher saveAndFlush(Teacher teacher) {
        return jpaRepository.saveAndFlush(teacher);
    }

    @Override
    public List<Teacher> saveAll(List<Teacher> teachers) {
        return jpaRepository.saveAll(teachers);
    }

    @Override
    public List<Teacher> findAll() {
        return jpaRepository.findAll();
    }

    @Override
    public void delete(Teacher teacher) {
        jpaRepository.delete(teacher);
    }

    @Override
    public List<Teacher> findByIdIn(List<Long> ids) {
        return jpaRepository.findAllById(ids);
    }

    @Override
    public List<TeacherDTO> findAllDTO() {
        return jpaRepository.findAllDTO();
    }

    @Override
    public List<Teacher> findByNameLike(String name) {
        return jpaRepository.findByNameLike(name);
    }

}
