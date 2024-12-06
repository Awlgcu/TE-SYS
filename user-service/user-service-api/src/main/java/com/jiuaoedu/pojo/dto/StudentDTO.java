package com.jiuaoedu.pojo.dto;

import com.jiuaoedu.share.Command;

import java.io.Serializable;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 17:06
 * @version: 1.0
 */

public class StudentDTO implements Command {
    private Long id;
    private String username;
    private Integer age;
    private String gender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
