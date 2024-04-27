package com.study.tddboard.common.config;

import org.springframework.context.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.config.*;

import java.util.*;

@Configuration
@EnableJpaAuditing
public class JpaAuditingConfig {

    @Bean
    AuditorAware<String> auditorAware () {
        return () -> Optional.of("CoRaveler");
    }
}
