package com.jiuaoedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/3 10:54
 * @version: 1.0
 */

@EnableJpaAuditing
@SpringBootApplication
public class EvaluationServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EvaluationServiceApplication.class, args);
    }
}
