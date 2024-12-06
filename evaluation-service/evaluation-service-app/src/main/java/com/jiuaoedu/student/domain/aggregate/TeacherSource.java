package com.jiuaoedu.student.domain.aggregate;

import com.jiuaoedu.share.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 16:41
 * @version: 1.0
 */

@Entity
public class TeacherSource extends AbstractEntity {
    private Long teacherId;

    public TeacherSource(){}
    public TeacherSource(Long teacherId) {
        this.teacherId = teacherId;
    }
    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;

    @Override
    public String toString(){
        return this.teacherId+"";
    }

    public Long getTeacherId() {
        return teacherId;
    }

    /**
     * 领域行为,绑定学生
     * @param student
     */
    public void setStudent(Student student) {
        this.student = student;
    }

    /**
     * 领域行为,解除学生绑定
     */
    public void detach(){
        this.student = null;
    }
}
