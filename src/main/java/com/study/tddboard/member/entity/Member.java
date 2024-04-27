package com.study.tddboard.member.entity;

import com.study.tddboard.common.entity.*;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
public class Member extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String username;
    @Column(length = 20)
    private String password;
    @Enumerated(value = EnumType.STRING)
    private Role role;

    // DB 에서 데이터 끌고 올때 사용하는 생성자
    @Builder
    public Member(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Member(String username, String password, String token) {
        this.username = username;
        this.password = password;

        if (!verifyToken(token)) {
            // 에러 처리
        }
        this.role = Role.getRoleByRoleName(token);
    }

    private boolean verifyToken(String token) {
        return false;
    }
}
