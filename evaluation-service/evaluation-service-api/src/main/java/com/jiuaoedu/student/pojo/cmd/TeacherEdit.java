package com.jiuaoedu.student.pojo.cmd;

import org.jetbrains.annotations.NotNull;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 17:35
 * @version: 1.0
 */

public class TeacherEdit {
    @NotNull
    private Long teacherId;
    @NotNull
    private Long studentId;
    public Long getTeacherId() {
        return teacherId;
    }
    public Long getStudentId() {
        return studentId;
    }

}
