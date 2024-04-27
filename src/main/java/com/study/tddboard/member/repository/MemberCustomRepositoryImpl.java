package com.study.tddboard.member.repository;

import com.querydsl.jpa.impl.*;
import com.study.tddboard.member.domain.*;
import jakarta.persistence.*;

import java.util.*;

public class MemberCustomRepositoryImpl implements MemberCustomRepository {

    private final JPAQueryFactory queryFactory;

    public MemberCustomRepositoryImpl(EntityManager em) {
        queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public List<MemberWithoutId> getMembersByPageAndOffset(int page, int offset) {
        return null;
    }
}
