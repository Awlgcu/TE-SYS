package com.jiuaoedu.admin.infrastructure.assembler;

import com.jiuaoedu.admin.pojo.dto.AdminAll;
import com.jiuaoedu.admin.domain.aggregate.Admin;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/5 9:37
 * @version: 1.0
 */
@Component
public class AdminAllAssembler {
    public AdminAll assemble(Admin admin) {
        AdminAll adminAll = new AdminAll();
        adminAll.setUsername(admin.getUsername());
        adminAll.setAge(admin.getAge());
        adminAll.setGender(admin.getGender());
        adminAll.setPassword(admin.getPassword());
        adminAll.setId(admin.getId());
        return adminAll;
    }
    public List<AdminAll> assembleAll(List<Admin> admins) {
        List<AdminAll> adminAlls = new ArrayList<>();
        for (Admin admin : admins) {
            adminAlls.add(assemble(admin));
        }
        return adminAlls;
    }
}
