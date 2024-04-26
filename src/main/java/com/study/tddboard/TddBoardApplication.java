package com.study.tddboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.*;

@EnableJpaAuditing
@SpringBootApplication
public class TddBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(TddBoardApplication.class, args);
    }

}
