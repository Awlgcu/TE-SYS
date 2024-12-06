package com.jiuaoedu.teacher.application.query;

import com.jiuaoedu.share.BaseRepository;
import com.jiuaoedu.teacher.domain.aggregate.Teacher;
import com.jiuaoedu.teacher.pojo.dto.TeacherAll;
import com.jiuaoedu.teacher.pojo.dto.TeacherDTO;

import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 17:56
 * @version: 1.0
 */

public interface TeacherQuery {
    List<TeacherDTO> findAll();
    TeacherAll findById(Long id);
    List<TeacherAll> findByNameLike(String name);
    List<TeacherDTO> findByIds(List<Long> ids);
}
