package com.jiuaoedu.api;

import com.jiuaoedu.pojo.cmd.StudentCreate;
import com.jiuaoedu.pojo.cmd.StudentUpdate;
import com.jiuaoedu.pojo.cmd.TeacherEdit;
import com.jiuaoedu.pojo.dto.StudentAll;
import com.jiuaoedu.pojo.dto.StudentDTO;
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

@RequestMapping("/user-service/student")
public interface StudentApi {
    //增删改接口
    @PostMapping("/add")
    void addStudent(@RequestBody @Validated StudentCreate cmd);
    @PostMapping("/update")
    void updateStudent(@RequestBody @Validated StudentUpdate cmd);
    @DeleteMapping("/delete")
    void deleteStudent(@RequestParam @NotNull Long id);

    //修改跟学生关联的老师
    @PostMapping("/teacher/add")
    void addTeacher(@RequestBody @Validated TeacherEdit cmd);
    @PostMapping("/teacher/remove")
    void removeTeacher(@RequestBody @Validated TeacherEdit cmd);


    //查询接口
    @GetMapping("/get/all")
    List<StudentDTO> findAll();
    @GetMapping("/get/byId")
    StudentAll findById(@RequestParam @NotNull Long id);
    @GetMapping("/get/byNameLike")
    List<StudentAll> findByNameLike(@RequestParam @NotNull String name);


    //评价接口,学生自己使用,会向evaluation服务发起请求
    //对方需要的是一个ResultCreate实体,前端需要传ResultCreate相关信息

    //评价是用户的一个动作,但是前端可以直接请求评价服务,用户服务这里可以不用再发请求了
    //todo 必须发吗???
//    void doEvaluation();


}
