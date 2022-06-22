package com.my.blog.domain.Member.domain.dao;

import com.my.blog.domain.Member.domain.vo.Member;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    // username을 기준으로 Member를 가져오는 역할을 수행. EntityGraph를 통해 Eager조회로 authorities정보를 조인해서 가져옴
    @EntityGraph(attributePaths = "authorities")
    Optional<Member> findOneWithAuthoritiesByUsername(String username);
}
