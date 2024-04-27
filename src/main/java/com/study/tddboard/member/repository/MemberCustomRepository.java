package com.study.tddboard.member.repository;

import com.study.tddboard.member.domain.*;

import java.util.*;

public interface MemberCustomRepository {

    List<MemberWithoutId> getMembersByPageAndOffset(int page, int offset);
}
