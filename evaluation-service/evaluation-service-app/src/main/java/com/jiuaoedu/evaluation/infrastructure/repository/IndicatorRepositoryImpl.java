package com.jiuaoedu.evaluation.infrastructure.repository;

import com.jiuaoedu.evaluation.domain.aggregate.Indicator;
import com.jiuaoedu.evaluation.domain.gateway.repository.IndicatorRepository;
import com.jiuaoedu.evaluation.infrastructure.repository.jpa.IndicatorJpaRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/3 14:04
 * @version: 1.0
 */
@Repository
public class IndicatorRepositoryImpl implements IndicatorRepository {
    @Resource
    private IndicatorJpaRepository jpaRepository;
    @Override
    public Optional<Indicator> findById(Long id) {
        return jpaRepository.findById(id);
    }

    @Override
    public Indicator save(Indicator indicator) {
        return jpaRepository.save(indicator);
    }

    @Override
    public Indicator saveAndFlush(Indicator indicator) {
        return jpaRepository.saveAndFlush(indicator);
    }

    @Override
    public List<Indicator> saveAll(List<Indicator> indicators) {
        return jpaRepository.saveAll(indicators);
    }

    @Override
    public List<Indicator> findAll() {
        return jpaRepository.findAll();
    }

    @Override
    public void delete(Indicator indicator) {
        jpaRepository.delete(indicator);
    }

    @Override
    public List<Indicator> findByIdIn(List<Long> ids) {
        return jpaRepository.findAllById(ids);
    }

    @Override
    public List<Indicator> findByType(String type) {
        return jpaRepository.findByType(type);
    }
}
