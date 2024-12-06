package com.jiuaoedu.admin.application;

import com.jiuaoedu.admin.pojo.cmd.AdminCreate;
import com.jiuaoedu.admin.pojo.cmd.AdminUpdate;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 17:55
 * @version: 1.0
 */

public interface AdminApplication {
    void addAdmin(AdminCreate cmd);
    void updateAdmin(AdminUpdate cmd);
    void deleteAdmin(Long id);
}
