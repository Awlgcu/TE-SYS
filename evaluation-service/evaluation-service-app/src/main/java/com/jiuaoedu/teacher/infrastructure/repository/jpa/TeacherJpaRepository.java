package com.jiuaoedu.teacher.infrastructure.repository.jpa;

import com.jiuaoedu.teacher.pojo.dto.TeacherDTO;
import com.jiuaoedu.teacher.domain.aggregate.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 16:26
 * @version: 1.0
 */

public interface TeacherJpaRepository extends JpaRepository<Teacher, Long> {
    @Query(nativeQuery = true, value = "select * from teacher")
    List<TeacherDTO> findAllDTO();

    @Query(nativeQuery = true,value = "select id, username, password, age , gender from teacher where username like CONCAT('%', ?1, '%')")
    List<Teacher> findByNameLike(String name);
}
