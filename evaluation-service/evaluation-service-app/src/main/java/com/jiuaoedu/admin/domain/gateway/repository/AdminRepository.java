package com.jiuaoedu.admin.domain.gateway.repository;

import com.jiuaoedu.admin.pojo.dto.AdminDTO;
import com.jiuaoedu.share.BaseRepository;
import com.jiuaoedu.admin.domain.aggregate.Admin;

import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 16:23
 * @version: 1.0
 */

public interface AdminRepository extends BaseRepository<Admin, Long> {
    List<AdminDTO> findAllDTO();
    List<Admin> findByNameLike(String name);
}
