package com.study.tddboard.member.domain;

import com.querydsl.core.annotations.*;
import com.study.tddboard.common.entity.*;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor
public class MemberWithoutId {

    private String username;
    private String password;
    private Role role;

    @QueryProjection
    public MemberWithoutId(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
}
