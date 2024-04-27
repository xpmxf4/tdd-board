package com.study.tddboard.member.repository;

import com.querydsl.core.types.*;
import com.querydsl.jpa.impl.*;
import com.study.tddboard.member.domain.*;
import jakarta.persistence.*;

import java.util.*;

import static com.study.tddboard.member.entity.QMember.member;

public class MemberCustomRepositoryImpl implements MemberCustomRepository {

    private final JPAQueryFactory queryFactory;

    public MemberCustomRepositoryImpl(EntityManager em) {
        queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public List<MemberWithoutId> getMembersByPageAndOffset(int page, int pageSize) {

        return queryFactory
                .select(Projections.constructor(
                                MemberWithoutId.class,
                                member.username,
                                member.password,
                                member.role
                        )
                )
                .from(member)
                .offset((long) (page - 1) * pageSize)
                .limit(pageSize)
                .fetch();
    }
}
