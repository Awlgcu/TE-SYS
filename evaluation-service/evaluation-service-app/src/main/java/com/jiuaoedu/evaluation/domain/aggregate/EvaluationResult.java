package com.jiuaoedu.evaluation.domain.aggregate;

import com.jiuaoedu.share.AbstractEntity;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * @description: 评价结果
 * @author: Rick
 * @date: 2024/12/4 11:22
 * @version: 1.0
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "evaluation_result")
public class EvaluationResult extends AbstractEntity {

    @Column(name = "indicator_id")
    private Long indicatorId;

    private String result;

    @Column(name = "teacher_id")
    private Long teacherId;

    @Column(name = "student_id")
    private Long studentId;

    @CreatedDate
    @Column(name = "create_time")
    private Date createTime;

    @LastModifiedDate
    @Column(name = "update_time")
    private Date updateTime;

    public void setIndicatorId(Long indicatorId) {
        this.indicatorId = indicatorId;
    }

    public void setResult(String result) {
        this.result = result;
    }


    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getIndicatorId() {
        return indicatorId;
    }

    public String getResult() {
        return result;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }
}
