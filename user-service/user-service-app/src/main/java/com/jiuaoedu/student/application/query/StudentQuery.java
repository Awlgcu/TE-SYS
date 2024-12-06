package com.jiuaoedu.student.application.query;

import com.jiuaoedu.pojo.dto.StudentAll;
import com.jiuaoedu.pojo.dto.StudentDTO;
import com.sun.istack.internal.NotNull;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 17:56
 * @version: 1.0
 */

public interface StudentQuery {
    List<StudentDTO> findAll();
    StudentAll findById(Long id);
    List<StudentAll> findByNameLike(String name);
}
