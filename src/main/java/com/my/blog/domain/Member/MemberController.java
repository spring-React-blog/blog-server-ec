package com.my.blog.domain.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @PostMapping("/members")
    public ResponseEntity<Member> signup(@RequestBody Member member) {
        return new ResponseEntity<>(memberRepository.save(member), HttpStatus.OK);
    }
}
