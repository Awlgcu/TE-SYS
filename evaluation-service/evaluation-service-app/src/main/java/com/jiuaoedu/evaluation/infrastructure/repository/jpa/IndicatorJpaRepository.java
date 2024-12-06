package com.jiuaoedu.evaluation.infrastructure.repository.jpa;

import com.jiuaoedu.evaluation.domain.aggregate.Indicator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/3 14:20
 * @version: 1.0
 */

public interface IndicatorJpaRepository extends JpaRepository<Indicator, Long> {
    @Query(nativeQuery = true, value = "select * from indicator where type=:type")
    List<Indicator> findByType(@Param("type") String type);

}
