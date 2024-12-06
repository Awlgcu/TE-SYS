package com.jiuaoedu.teacher.api;
import com.jiuaoedu.teacher.pojo.cmd.TeacherCreate;
import com.jiuaoedu.teacher.pojo.cmd.TeacherUpdate;
import com.jiuaoedu.teacher.pojo.dto.TeacherAll;
import com.jiuaoedu.teacher.pojo.dto.TeacherDTO;
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

@RequestMapping("/user-service/teacher")
public interface TeacherApi {
    //增删改接口
    @PostMapping("/add")
    void addTeacher(@RequestBody @Validated TeacherCreate cmd);
    @PostMapping("/update")
    void updateTeacher(@RequestBody @Validated TeacherUpdate cmd);
    @DeleteMapping("/delete")
    void deleteTeacher(@RequestParam @NotNull Long id);

    //查询接口
    @GetMapping("/get/all")
    List<TeacherDTO> findAll();
    @GetMapping("/get/byId")
    TeacherAll findById(@RequestParam @NotNull Long id);
    @GetMapping("/get/byNameLike")
    List<TeacherAll> findByNameLike(@RequestParam @NotNull String name);

    @GetMapping("/get/byIds")
    List<TeacherDTO> findByIds(@RequestParam @NotNull List<Long> ids);

}
