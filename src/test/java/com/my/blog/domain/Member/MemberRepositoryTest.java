package com.my.blog.domain.Member;

import com.my.blog.BlogServerEcApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
public class MemberRepositoryTest extends BlogServerEcApplication {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void insert() {
        Member member = Member.builder()
                .userEmail("aa")
                .userPassword("bb")
                .userNickname("cc")
                .userName("dd")
                .build();
        memberRepository.save(member);
    }
}