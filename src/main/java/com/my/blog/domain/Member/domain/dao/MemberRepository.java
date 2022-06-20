package com.my.blog.domain.Member.domain.dao;

import com.my.blog.domain.Member.domain.vo.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
