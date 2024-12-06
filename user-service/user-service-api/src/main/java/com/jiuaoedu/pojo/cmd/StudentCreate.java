package com.jiuaoedu.pojo.cmd;

import org.jetbrains.annotations.NotNull;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 16:59
 * @version: 1.0
 */

public class StudentCreate {
    @NotNull
    private String username;
    @NotNull
    private String password;
    private Integer age;
    private String gender;

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
