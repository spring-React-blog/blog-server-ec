package com.my.blog.global.jwt.application;

import com.my.blog.domain.Member.domain.dao.MemberRepository;
import com.my.blog.domain.Member.domain.vo.Member;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Component("memberDetailsService")
public class CustomMemberDetailsService implements UserDetailsService {
    private final MemberRepository memberRepository;

    public CustomMemberDetailsService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // 로그인 시 authenticate 메소드를 수행하고 Member정보를 조회한다.
    @Override
    @Transactional
    public UserDetails loadUserByUsername(final String username) {
        return memberRepository.findOneWithAuthoritiesByUsername(username)
                .map(member -> createUser(username, member))
                .orElseThrow(() -> new UsernameNotFoundException(username + " -> 데이터베이스에서 찾을 수 없습니다."));
    }

    private org.springframework.security.core.userdetails.User createUser(String username, Member member) {
//        if (!member.isActivated()) {
//            throw new RuntimeException(username + " -> 활성화되어 있지 않습니다.");
//        }
        List<GrantedAuthority> grantedAuthorities = member.getAuthorities().stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getAuthorityName()))
                .collect(Collectors.toList());
        return new org.springframework.security.core.userdetails.User(member.getUserName(),
                member.getUserPassword(),
                grantedAuthorities);
    }
}
