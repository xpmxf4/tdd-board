package com.study.tddboard.member.repository;

import com.study.tddboard.member.entity.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
