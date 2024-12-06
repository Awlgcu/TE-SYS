package com.jiuaoedu.admin.infrastructure.repository.jpa;

import com.jiuaoedu.admin.pojo.dto.AdminDTO;
import com.jiuaoedu.admin.domain.aggregate.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 16:26
 * @version: 1.0
 */

public interface AdminJpaRepository extends JpaRepository<Admin, Long> {
    @Query(nativeQuery = true, value = "select * from admin")
    List<AdminDTO> findAllDTO();

    @Query(nativeQuery = true,value = "select id, username, password, age , gender from admin where username like CONCAT('%', ?1, '%')")
    List<Admin> findByNameLike(String name);
}
