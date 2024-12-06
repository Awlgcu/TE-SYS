package com.jiuaoedu.evaluation.infrastructure.repository;

import com.jiuaoedu.evaluation.domain.aggregate.Choice;
import com.jiuaoedu.evaluation.domain.gateway.repository.ChoiceRepository;
import com.jiuaoedu.evaluation.infrastructure.repository.jpa.ChoiceJpaRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 9:53
 * @version: 1.0
 */

@Repository
public class ChoiceRepositoryImpl implements ChoiceRepository {
    @Resource
    private ChoiceJpaRepository choiceJpaRepository;

    @Override
    public Optional<Choice> findById(Long id) {
        return choiceJpaRepository.findById(id);
    }

    @Override
    public Choice save(Choice choice) {
        return choiceJpaRepository.save(choice);
    }

    @Override
    public Choice saveAndFlush(Choice choice) {
        return choiceJpaRepository.saveAndFlush(choice);
    }

    @Override
    public List<Choice> saveAll(List<Choice> choices) {
        return choiceJpaRepository.saveAll(choices);
    }

    @Override
    public List<Choice> findAll() {
        return choiceJpaRepository.findAll();
    }

    @Override
    public void delete(Choice choice) {
        choiceJpaRepository.delete(choice);
    }

    @Override
    public List<Choice> findByIdIn(List<Long> ids) {
        return choiceJpaRepository.findAllById(ids);
    }
}
