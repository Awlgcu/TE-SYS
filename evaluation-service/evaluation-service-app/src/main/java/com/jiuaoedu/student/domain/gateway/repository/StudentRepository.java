package com.jiuaoedu.student.domain.gateway.repository;

import com.jiuaoedu.student.pojo.dto.StudentDTO;
import com.jiuaoedu.share.BaseRepository;
import com.jiuaoedu.student.domain.aggregate.Student;

import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 16:23
 * @version: 1.0
 */

public interface StudentRepository extends BaseRepository<Student, Long> {
    List<StudentDTO> findAllDTO();
    List<Student> findByNameLike(String name);
}
