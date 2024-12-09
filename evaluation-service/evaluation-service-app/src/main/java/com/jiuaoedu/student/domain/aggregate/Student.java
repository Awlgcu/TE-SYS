package com.jiuaoedu.student.domain.aggregate;

import com.jiuaoedu.share.AbstractUser;
import com.jiuaoedu.student.infrastracture.converter.AddressConverter;

import javax.persistence.*;
import java.util.List;

/**
 * @description: 学生领域聚合根
 * @author: Rick
 * @date: 2024/12/4 16:07
 * @version: 1.0
 */

@Entity
public class Student extends AbstractUser {

    //学生和老师的多对多关系转化为了一对多关系
    @OneToMany(mappedBy = "student", cascade = {CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.EAGER)
    private List<TeacherSource> teachers;

    @Convert(converter = AddressConverter.class)
    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<TeacherSource> getTeachers() {
        return teachers;
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



    /**
     * 领域行为,添加老师
     * @param teacher
     */
    public void addTeacher(TeacherSource teacher){
        this.teachers.add(teacher);
    }

    /**
     * 领域行为,删除老师
     * @param teacher
     */
    public void removeTeacher(TeacherSource teacher){
        this.teachers.remove(teacher);
    }

}
