package com.jiuaoedu.admin.domain.aggregate;
import com.jiuaoedu.share.AbstractUser;
import com.jiuaoedu.student.domain.aggregate.TeacherSource;

import javax.persistence.Entity;
import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/5 12:15
 * @version: 1.0
 */
@Entity
public class Admin extends AbstractUser {
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age){
        this.age = age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public Long getId(){
        return this.id;
    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public Integer getAge(){
        return this.age;
    }
    public String getGender(){
        return this.gender;
    }
}
