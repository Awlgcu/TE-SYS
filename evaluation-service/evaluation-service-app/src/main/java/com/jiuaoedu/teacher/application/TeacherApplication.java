package com.jiuaoedu.teacher.application;


import com.jiuaoedu.teacher.pojo.cmd.TeacherCreate;
import com.jiuaoedu.teacher.pojo.cmd.TeacherUpdate;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 17:55
 * @version: 1.0
 */

public interface TeacherApplication {
    void addTeacher(TeacherCreate cmd);
    void updateTeacher(TeacherUpdate cmd);
    void deleteTeacher(Long id);
}
