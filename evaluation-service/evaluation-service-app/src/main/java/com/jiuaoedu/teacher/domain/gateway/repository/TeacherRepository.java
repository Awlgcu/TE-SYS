package com.jiuaoedu.teacher.domain.gateway.repository;

import com.jiuaoedu.teacher.pojo.dto.TeacherDTO;
import com.jiuaoedu.share.BaseRepository;
import com.jiuaoedu.teacher.domain.aggregate.Teacher;

import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 16:23
 * @version: 1.0
 */

public interface TeacherRepository extends BaseRepository<Teacher, Long> {
    List<TeacherDTO> findAllDTO();
    List<Teacher> findByNameLike(String name);
}
