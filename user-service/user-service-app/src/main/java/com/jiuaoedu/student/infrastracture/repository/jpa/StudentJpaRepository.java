package com.jiuaoedu.student.infrastracture.repository.jpa;

import com.jiuaoedu.pojo.dto.StudentDTO;
import com.jiuaoedu.student.domain.aggregate.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 16:26
 * @version: 1.0
 */

public interface StudentJpaRepository extends JpaRepository<Student, Long> {
    @Query(nativeQuery = true, value = "select * from student")
    List<StudentDTO> findAllDTO();

    @Query(nativeQuery = true,value = "select id, username, password, age , gender from student where username like CONCAT('%', ?1, '%')")
    List<Student> findByNameLike(String name);
}
