package com.jiuaoedu.evaluation.pojo.dto;

import com.jiuaoedu.share.Command;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 14:28
 * @version: 1.0
 */

public class EvaluationResultDTO implements Command {

    private Long indicatorId;

    private String indicatorDescription;

    private String result;

    private Long teacherId;

    private String teacherName;

    private Long studentId;

    private String studentName;

    public Long getIndicatorId() {
        return indicatorId;
    }

    public void setIndicatorId(Long indicatorId) {
        this.indicatorId = indicatorId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getIndicatorDescription() {
        return indicatorDescription;
    }

    public void setIndicatorDescription(String indicatorDescription) {
        this.indicatorDescription = indicatorDescription;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
