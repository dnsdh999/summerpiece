package com.summerroot.summerpiece.repository;

import com.summerroot.summerpiece.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

 /** by 민정 : JpaRepository를 상속(spring data jpa에서 제공하는 jpaRepository를 이용하면 unique한 email로 select)*/
public interface MemberSecuRepository extends JpaRepository<Member, Long> {
    // email를 통해 회원을 조회하기 위해 findByEmail() 생성
    Optional<Member> findByEmail(String email);
}