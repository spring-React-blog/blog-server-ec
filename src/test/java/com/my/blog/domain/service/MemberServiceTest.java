package com.my.blog.domain.service;

import com.my.blog.domain.dto.Member;
import com.my.blog.domain.repository.MemberRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@RunWith(SpringRunner.class)
class MemberServiceTest {

    // 참고한 junit설정 https://goddaehee.tistory.com/210
    @Autowired
    private MemberRepository memberRepository;

    @DisplayName("Member 저장 테스트")
    @Test
    void save() {
        Member member = Member.builder()
            .username("TEST")
            .build();
        Member insertMember = memberRepository.save(member);
        assertEquals(member, insertMember);
    }

    @DisplayName("Member 조회 테스트")
    @Test
    void findById() {
        Member member = Member.builder()
                .username("USERNAME")
                .build();
        Member insertMember = memberRepository.save(member);
        Optional<Member> findMember = memberRepository.findById(insertMember.getId());
        Member result = findMember.ofNullable(insertMember).orElseThrow();
        assertEquals(insertMember, result);
    }
}