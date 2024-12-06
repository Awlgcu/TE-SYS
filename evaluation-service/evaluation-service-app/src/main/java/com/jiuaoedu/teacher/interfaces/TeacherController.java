package com.jiuaoedu.teacher.interfaces;

import com.jiuaoedu.teacher.api.TeacherApi;
import com.jiuaoedu.teacher.application.query.TeacherQuery;
import com.jiuaoedu.teacher.pojo.cmd.TeacherCreate;
import com.jiuaoedu.teacher.pojo.cmd.TeacherUpdate;
import com.jiuaoedu.teacher.pojo.dto.TeacherAll;
import com.jiuaoedu.teacher.pojo.dto.TeacherDTO;
import com.jiuaoedu.teacher.application.TeacherApplication;
import org.jetbrains.annotations.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/5 14:21
 * @version: 1.0
 */
@RestController
@RequestMapping("/user-service/teacher")
public class TeacherController implements TeacherApi {
    @Resource
    private TeacherQuery teacherQuery;
    @Resource
    private TeacherApplication teacherApplication;

    @Override
    @PostMapping("/add")
    public void addTeacher(@RequestBody @Validated TeacherCreate cmd) {
        teacherApplication.addTeacher(cmd);
    }

    @Override
    @PostMapping("/update")
    public void updateTeacher(@RequestBody @Validated TeacherUpdate cmd) {
        teacherApplication.updateTeacher(cmd);
    }

    @Override
    @DeleteMapping("/delete")
    public void deleteTeacher(@RequestParam @NotNull Long id) {
        teacherApplication.deleteTeacher(id);
    }

    @Override
    @GetMapping("/get/all")
    public List<TeacherDTO> findAll() {
        return teacherQuery.findAll();
    }

    @Override
    @GetMapping("/get/byId")
    public TeacherAll findById(@RequestParam @NotNull Long id) {
        return teacherQuery.findById(id);
    }

    @Override
    @GetMapping("/get/byNameLike")
    public List<TeacherAll> findByNameLike(@RequestParam @NotNull String name) {
        return teacherQuery.findByNameLike(name);
    }

    @Override
    public List<TeacherDTO> findByIds(@NotNull List<Long> ids) {
        return teacherQuery.findByIds(ids);
    }
}
