package com.my.blog.domain.Member.domain.vo;

import com.my.blog.domain.Member.dto.MemberCount;
import com.my.blog.global.jwt.entity.Authority;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "Members")
public class Member {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(name = "email")
    private String userEmail;

    @Column(name = "password")
    private String userPassword;

    @Column(name = "name")
    private String userName;

    @Column(name = "nickname")
    private String userNickname;

    @Column(name = "birth")
    private Date userBirth;

    @Column(name = "role")
    private Enum role;

    @Column(name = "delete_time")
    private LocalDateTime leaveTime;

    // 자식 개체를 영속시키는 영속성 전이
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "MemberCounts")
    private MemberCount memberCount;


    @ManyToMany
    @JoinTable(
            name = "member_authority",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "authority_name", referencedColumnName = "authority_name")})
    private Set<Authority> authorities;

    @Builder
    public Member(String userEmail, String userPassword, String userName, String userNickname,
                  Date userBirth, Enum role, LocalDateTime leaveTime, MemberCount memberCount) {
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userNickname = userNickname;
        this.userBirth = userBirth;
        this.role = role;
        this.leaveTime = leaveTime;
        this.memberCount = memberCount;
    }

}
