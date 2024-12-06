package com.jiuaoedu.evaluation.domain.gateway.repository;

import com.jiuaoedu.evaluation.domain.aggregate.Indicator;
import com.jiuaoedu.share.BaseRepository;

import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/3 12:17
 * @version: 1.0
 */

public interface IndicatorRepository extends BaseRepository<Indicator,Long> {
    List<Indicator> findByType(String type);
}
