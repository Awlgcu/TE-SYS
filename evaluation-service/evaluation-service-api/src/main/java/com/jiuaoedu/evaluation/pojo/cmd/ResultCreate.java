package com.jiuaoedu.evaluation.pojo.cmd;

import org.jetbrains.annotations.NotNull;

import javax.persistence.Column;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 14:24
 * @version: 1.0
 */

public class ResultCreate {
    @NotNull
    private Long indicatorId;

    @NotNull
    private String result;

    @NotNull
    private Long teacherId;

    @NotNull
    private Long studentId;

    public @NotNull Long getIndicatorId() {
        return indicatorId;
    }

    public void setIndicatorId(@NotNull Long indicatorId) {
        this.indicatorId = indicatorId;
    }

    public @NotNull String getResult() {
        return result;
    }

    public void setResult(@NotNull String result) {
        this.result = result;
    }

    public @NotNull Long getStudentId() {
        return studentId;
    }

    public void setStudentId(@NotNull Long studentId) {
        this.studentId = studentId;
    }

    public @NotNull Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(@NotNull Long teacherId) {
        this.teacherId = teacherId;
    }
}
