package com.study.tddboard.member.service;

import com.study.tddboard.member.repository.*;
import lombok.*;
import org.springframework.stereotype.*;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;


}
