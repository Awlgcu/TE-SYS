package com.jiuaoedu.share;

import java.util.List;
import java.util.Optional;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/3 10:59
 * @version: 1.0
 */

public interface BaseRepository <AGGREGATE, ID>{
    Optional<AGGREGATE> findById(ID id);
    AGGREGATE save(AGGREGATE aggregate);
    AGGREGATE saveAndFlush(AGGREGATE aggregate);
    List<AGGREGATE> saveAll(List<AGGREGATE> aggregates);
    List<AGGREGATE> findAll();
    void delete(AGGREGATE aggregate);
    List<AGGREGATE> findByIdIn(List<ID> ids);
}
