package com.jiuaoedu.admin.api;
import com.jiuaoedu.admin.pojo.cmd.AdminCreate;
import com.jiuaoedu.admin.pojo.cmd.AdminUpdate;
import com.jiuaoedu.admin.pojo.dto.AdminAll;
import com.jiuaoedu.admin.pojo.dto.AdminDTO;
import org.jetbrains.annotations.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 16:56
 * @version: 1.0
 */

@RequestMapping("/user-service/admin")
public interface AdminApi {
    //增删改接口
    @PostMapping("/add")
    void addAdmin(@RequestBody @Validated AdminCreate cmd);
    @PostMapping("/update")
    void updateAdmin(@RequestBody @Validated AdminUpdate cmd);
    @DeleteMapping("/delete")
    void deleteAdmin(@RequestParam @NotNull Long id);

    //查询接口
    @GetMapping("/get/all")
    List<AdminDTO> findAll();
    @GetMapping("/get/byId")
    AdminAll findById(@RequestParam @NotNull Long id);
    @GetMapping("/get/byNameLike")
    List<AdminAll> findByNameLike(@RequestParam @NotNull String name);

}
