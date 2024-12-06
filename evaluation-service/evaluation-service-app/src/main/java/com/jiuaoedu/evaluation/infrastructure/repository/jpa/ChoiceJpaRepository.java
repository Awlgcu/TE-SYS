package com.jiuaoedu.evaluation.infrastructure.repository.jpa;

import com.jiuaoedu.evaluation.domain.aggregate.Choice;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 9:53
 * @version: 1.0
 */

public interface ChoiceJpaRepository extends JpaRepository<Choice, Long> {
}
