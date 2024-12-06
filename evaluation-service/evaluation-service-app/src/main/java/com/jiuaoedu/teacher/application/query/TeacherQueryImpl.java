package com.jiuaoedu.teacher.application.query;

import com.jiuaoedu.teacher.infrastructure.assembler.TeacherDTOAssembler;
import com.jiuaoedu.teacher.pojo.dto.TeacherAll;
import com.jiuaoedu.teacher.pojo.dto.TeacherDTO;
import com.jiuaoedu.teacher.domain.aggregate.Teacher;
import com.jiuaoedu.teacher.domain.gateway.repository.TeacherRepository;
import com.jiuaoedu.teacher.infrastructure.assembler.TeacherAllAssembler;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 18:00
 * @version: 1.0
 */
@Service
public class TeacherQueryImpl implements TeacherQuery {
    @Resource
    private TeacherRepository teacherRepository;

    @Resource
    private TeacherAllAssembler teacherAllAssembler;

    @Resource
    private TeacherDTOAssembler teacherDTOAssembler;

    @Override
    public List<TeacherDTO> findAll() {
        return teacherRepository.findAllDTO();
    }

    @Override
    public TeacherAll findById(Long id) {
        Teacher teacher = teacherRepository.findById(id).get();
        return teacherAllAssembler.assemble(teacher);
    }

    @Override
    public List<TeacherAll> findByNameLike(String name) {
        List<Teacher> teachers = teacherRepository.findByNameLike(name);
        return teacherAllAssembler.assembleAll(teachers);
    }

    @Override
    public List<TeacherDTO> findByIds(List<Long> ids) {
        List<Teacher> teachers = teacherRepository.findByIdIn(ids);
        return teacherDTOAssembler.assembleAll(teachers);
    }
}
