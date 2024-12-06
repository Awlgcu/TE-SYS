package com.jiuaoedu.admin.application.query;

import com.jiuaoedu.admin.infrastructure.assembler.AdminAllAssembler;
import com.jiuaoedu.admin.pojo.dto.AdminAll;
import com.jiuaoedu.admin.pojo.dto.AdminDTO;
import com.jiuaoedu.admin.domain.aggregate.Admin;
import com.jiuaoedu.admin.domain.gateway.repository.AdminRepository;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 18:00
 * @version: 1.0
 */
@Service
public class AdminQueryImpl implements AdminQuery {
    @Resource
    private AdminRepository adminRepository;

    @Resource
    private AdminAllAssembler adminAllAssembler;

    @Override
    public List<AdminDTO> findAll() {
        return adminRepository.findAllDTO();
    }

    @Override
    public AdminAll findById(Long id) {
        Admin admin = adminRepository.findById(id).get();
        return adminAllAssembler.assemble(admin);
    }

    @Override
    public List<AdminAll> findByNameLike(String name) {
        List<Admin> admins = adminRepository.findByNameLike(name);
        return adminAllAssembler.assembleAll(admins);
    }
}
