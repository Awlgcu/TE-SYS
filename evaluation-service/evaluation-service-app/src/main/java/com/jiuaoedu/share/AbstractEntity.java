package com.jiuaoedu.share;

import javax.persistence.*;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/3 10:57
 * @version: 1.0
 */


@MappedSuperclass
public abstract class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Long getId() {
        return id;
    }
}
