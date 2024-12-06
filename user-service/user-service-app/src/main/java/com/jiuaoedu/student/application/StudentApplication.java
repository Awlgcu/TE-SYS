package com.jiuaoedu.student.application;

import com.jiuaoedu.pojo.cmd.StudentCreate;
import com.jiuaoedu.pojo.cmd.StudentUpdate;
import com.jiuaoedu.pojo.cmd.TeacherEdit;
import com.jiuaoedu.student.domain.aggregate.Student;

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
}
