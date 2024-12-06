package com.jiuaoedu.student.interfaces;

import com.jiuaoedu.student.api.StudentApi;
import com.jiuaoedu.student.pojo.cmd.StudentCreate;
import com.jiuaoedu.student.pojo.cmd.StudentUpdate;
import com.jiuaoedu.student.pojo.cmd.TeacherEdit;
import com.jiuaoedu.student.pojo.dto.StudentAll;
import com.jiuaoedu.student.pojo.dto.StudentDTO;
import com.jiuaoedu.student.application.StudentApplication;
import com.jiuaoedu.student.application.query.StudentQuery;
import com.sun.istack.internal.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 17:50
 * @version: 1.0
 */
@RestController
@RequestMapping("/user-service/student")
public class StudentController implements StudentApi {
    @Resource
    private StudentApplication studentApplication;
    @Resource
    private StudentQuery studentQuery;


    @PostMapping("/add")
    @Override
    public void addStudent(@RequestBody @Validated StudentCreate cmd){
        studentApplication.addStudent(cmd);
    }

    @PostMapping("/update")
    @Override
    public void updateStudent(@RequestBody @Validated StudentUpdate cmd){
        studentApplication.updateStudent(cmd);
    }

    @DeleteMapping("/delete")
    @Override
    public void deleteStudent(@RequestParam @NotNull Long id){
        studentApplication.deleteStudent(id);
    }

    //修改跟学生关联的老师
    @PostMapping("/teacher/add")
    @Override
    public void addTeacher(@RequestBody @Validated TeacherEdit cmd){
        studentApplication.addTeacher(cmd);
    }

    @Override
    @PostMapping("/teacher/remove")
    public void removeTeacher(@RequestBody @Validated TeacherEdit cmd){
        studentApplication.removeTeacher(cmd);
    }


    //查询接口
    @GetMapping("/get/all")
    @Override
    public List<StudentDTO> findAll(){
        return studentQuery.findAll();
    }
    @GetMapping("/get/byId")
    @Override
    public StudentAll findById(@RequestParam @NotNull Long id){
        return studentQuery.findById(id);
    }

    @Override
    @GetMapping("/get/byNameLike")
    public List<StudentAll> findByNameLike(@RequestParam @NotNull String name){
        return studentQuery.findByNameLike(name);
    }
}
