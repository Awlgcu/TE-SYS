package com.jiuaoedu.share;

import javax.persistence.*;

/**
 * @description: 
 * @author: Rick
 * @date: 2024/12/4 15:59
 * @version: 1.0
 */

@MappedSuperclass
public abstract class AbstractUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(nullable = false, name = "username")
    protected String username;
    @Column(nullable = false)
    protected String password="123";
    protected Integer age;
    protected String gender;

}
