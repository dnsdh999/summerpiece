package com.summerroot.summerpiece.service;

import com.summerroot.summerpiece.domain.Member;
import com.summerroot.summerpiece.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Member findOnd(int id) {
        return memberRepository.findOne(id);
    }
}
