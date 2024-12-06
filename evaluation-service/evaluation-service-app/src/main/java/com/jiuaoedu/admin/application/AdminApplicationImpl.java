package com.jiuaoedu.admin.application;

import com.jiuaoedu.admin.pojo.cmd.AdminCreate;
import com.jiuaoedu.admin.pojo.cmd.AdminUpdate;
import com.jiuaoedu.admin.domain.aggregate.Admin;
import com.jiuaoedu.admin.domain.gateway.repository.AdminRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 18:01
 * @version: 1.0
 */

@Service
public class AdminApplicationImpl implements AdminApplication {
    @Resource
    private AdminRepository adminRepository;
    @Override
    public void addAdmin(AdminCreate cmd) {
        Admin admin = new Admin();
        admin.setAge(cmd.getAge());
        admin.setPassword(cmd.getPassword());
        admin.setGender(cmd.getGender());
        admin.setUsername(cmd.getUsername());
        adminRepository.save(admin);
    }

    @Override
    public void updateAdmin(AdminUpdate cmd) {
        Admin admin = adminRepository.findById(cmd.getId()).get();
        admin.setUsername(cmd.getUsername());
        admin.setPassword(cmd.getPassword());
        admin.setAge(cmd.getAge());
        admin.setGender(cmd.getGender());
        adminRepository.save(admin);
    }

    @Override
    public void deleteAdmin(Long id) {
        Admin admin = adminRepository.findById(id).get();
        adminRepository.delete(admin);
    }


}
