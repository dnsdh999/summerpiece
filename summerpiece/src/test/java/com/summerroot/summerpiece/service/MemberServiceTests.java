package com.summerroot.summerpiece.service;

import com.summerroot.summerpiece.domain.Member;
import com.summerroot.summerpiece.repository.MemberRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MemberServiceTests {

    @Autowired private MemberService memberService;
    @Autowired private MemberRepository memberRepository;
    @Autowired private EntityManager em;

    @Test
    public void 회원_정보_조회() throws Exception {
        //given
        Member member = new Member("test@test.com", "pwd", "kim", "kkim", "01011112222");
        memberRepository.save(member);

        //when
        Member findMember = memberService.findOnd(member.getId());

        //then
        em.flush();
        assertEquals(member, findMember);
    }
}
