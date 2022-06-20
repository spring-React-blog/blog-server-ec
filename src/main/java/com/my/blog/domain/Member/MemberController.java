package com.my.blog.domain.Member;

import com.my.blog.domain.Member.domain.vo.Member;
import com.my.blog.domain.Member.domain.dao.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/public")
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("hello");
    }
    @PostMapping("/members")
    ResponseEntity<Member> signup(@RequestBody Member member) {
        return new ResponseEntity<>(memberRepository.save(member), HttpStatus.OK);
    }


}
