package com.jiuaoedu.student.pojo.dto;

import com.jiuaoedu.share.Command;
import com.jiuaoedu.teacher.pojo.dto.TeacherDTO;

import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 17:09
 * @version: 1.0
 */

public class StudentAll implements Command {
    private Long id;
    private String username;
    //展示的时候老师集合已经转化为字符串了
    private List<TeacherDTO> teachers;
    private String password;
    private Integer age;
    private String gender;

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setTeachers(List<TeacherDTO> teachers) {
        this.teachers = teachers;
    }
    public List<TeacherDTO> getTeachers() {
        return teachers;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }



    public String getPassword() {
        return password;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

}
