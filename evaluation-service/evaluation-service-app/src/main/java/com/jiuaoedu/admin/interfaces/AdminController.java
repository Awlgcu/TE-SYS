package com.jiuaoedu.admin.interfaces;

import com.jiuaoedu.admin.application.AdminApplication;

import com.jiuaoedu.admin.api.AdminApi;
import com.jiuaoedu.admin.application.query.AdminQuery;
import com.jiuaoedu.admin.pojo.cmd.AdminCreate;
import com.jiuaoedu.admin.pojo.cmd.AdminUpdate;
import com.jiuaoedu.admin.pojo.dto.AdminAll;
import com.jiuaoedu.admin.pojo.dto.AdminDTO;
import org.jetbrains.annotations.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/5 14:21
 * @version: 1.0
 */
@RestController
@RequestMapping("/user-service/admin")
public class AdminController implements AdminApi {
    @Resource
    private AdminQuery adminQuery;
    @Resource
    private AdminApplication adminApplication;

    @GetMapping("/hello")
    public List<String> hello(){
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        return list;
    }

    @Override
    @PostMapping("/add")
    public void addAdmin(@RequestBody @Validated AdminCreate cmd) {
        adminApplication.addAdmin(cmd);
    }

    @Override
    @PostMapping("/update")
    public void updateAdmin(@RequestBody @Validated AdminUpdate cmd) {
        adminApplication.updateAdmin(cmd);
    }

    @Override
    @DeleteMapping("/delete")
    public void deleteAdmin(@RequestParam @NotNull Long id) {
        adminApplication.deleteAdmin(id);
    }

    @Override
    @GetMapping("/get/all")
    public List<AdminDTO> findAll() {
        return adminQuery.findAll();
    }

    @Override
    @GetMapping("/get/byId")
    public AdminAll findById(@RequestParam @NotNull Long id) {
        return adminQuery.findById(id);
    }

    @Override
    @GetMapping("/get/byNameLike")
    public List<AdminAll> findByNameLike(@RequestParam @NotNull String name) {
        return adminQuery.findByNameLike(name);
    }
}
