package com.study.tddboard.member.entity;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    @Test
    @DisplayName("관리자 인증이 되지 않은 채로 관리자로 생성하려면 예외가 난다.")
    void test() {
        // given
        String username = "minjae";
        String password = "1234";
        String invalidToken = "invalidToken";

        // when
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new Member(username, password, invalidToken);
        }, "유저 생성에 올바르지 않은 토큰이 사용되었습니다.");

        // then
        assertTrue(thrown.getMessage().equals("유저 생성에 올바르지 않은 토큰이 사용되었습니다."));
    }
}