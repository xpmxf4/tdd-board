package com.study.tddboard.common.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.*;

import java.time.*;

public abstract class BaseEntity {

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;
}
