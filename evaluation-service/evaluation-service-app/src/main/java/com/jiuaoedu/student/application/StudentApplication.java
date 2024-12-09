package com.jiuaoedu.student.application;

import com.jiuaoedu.student.pojo.cmd.StudentCreate;
import com.jiuaoedu.student.pojo.cmd.StudentUpdate;
import com.jiuaoedu.student.pojo.cmd.TeacherEdit;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 17:55
 * @version: 1.0
 */

public interface StudentApplication {
    void addStudent(StudentCreate cmd);
    void updateStudent(StudentUpdate cmd);
    void deleteStudent(Long id);
    void addTeacher(TeacherEdit cmd);
    void removeTeacher(TeacherEdit cmd);

    void addAddress(Long id);
}
