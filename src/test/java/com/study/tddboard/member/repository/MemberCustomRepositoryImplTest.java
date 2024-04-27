package com.study.tddboard.member.repository;

import com.study.tddboard.common.entity.*;
import com.study.tddboard.member.domain.*;
import com.study.tddboard.member.entity.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.autoconfigure.orm.jpa.*;
import org.springframework.boot.test.context.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberCustomRepositoryImplTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    @DisplayName("관리자가 회원 목록을 불러올 때, 첫 페이지에서 20 개의 회원을 조회할 수 있다.")
    void bringOnly20MembersAtATime() throws Exception {
        // given - 상황 만들기
        put100DatasInDB();

        // when - 동작
        List<MemberWithoutId> members = memberRepository.getMembersByPageAndOffset(1, 20);

        // then - 검증
        assertEquals(20, members.size());
    }

    private void put100DatasInDB() {
        List<Member> membersOf100 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Member member = new Member(String.valueOf(i), String.valueOf(i), Role.USER);
        }
        memberRepository.saveAll(membersOf100);
    }
}