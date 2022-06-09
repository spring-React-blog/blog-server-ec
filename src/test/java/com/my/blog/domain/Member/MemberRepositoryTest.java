package com.my.blog.domain.Member;

import com.my.blog.BlogServerEcApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
public class MemberRepositoryTest extends BlogServerEcApplication {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void insert() {
        MemberCount membercount = MemberCount.builder()
                .followerCount(23)
                .followingCount(30)
                .build();
        Member member = Member.builder()
                .userEmail("aa")
                .userPassword("bb")
                .userNickname("cc")
                .userName("dd")
                .memberCount(membercount)
                .build();

        memberRepository.save(member);

        List<Member> members = memberRepository.findAll();
        assertThat(members.get(0).getUserName()).isEqualTo("dd");
        assertThat(members.get(0).getMemberCount().getFollowerCount()).isEqualTo(23);
    }
    // CRUD. insert select update delete
    @Test
    public void select() {

    }

    @Test
    public void update() {

    }

    @Test
    public void delete() {

    }
}