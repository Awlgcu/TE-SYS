package com.jiuaoedu.admin.application.query;

import com.jiuaoedu.admin.pojo.dto.AdminAll;
import com.jiuaoedu.admin.pojo.dto.AdminDTO;
import com.jiuaoedu.student.pojo.dto.StudentAll;
import com.jiuaoedu.student.pojo.dto.StudentDTO;

import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 17:56
 * @version: 1.0
 */

public interface AdminQuery {
    List<AdminDTO> findAll();
    AdminAll findById(Long id);
    List<AdminAll> findByNameLike(String name);
}
