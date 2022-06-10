package com.my.blog.domain.Member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "Members")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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
    private Timestamp leaveTime;

    // 자식 개체를 영속시키는 영속성 전이
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "MemberCounts")
    private MemberCount memberCount;


    @Builder
    public Member(String userEmail, String userPassword, String userName, String userNickname,
                  Date userBirth, Enum role, Timestamp leaveTime, MemberCount memberCount) {
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userNickname = userNickname;
        this.userBirth = userBirth;
        this.role = role;
        this.leaveTime = leaveTime;
        this.memberCount = memberCount;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userName='" + userName + '\'' +
                ", userNickname='" + userNickname + '\'' +
                ", userBirth=" + userBirth +
                ", role=" + role +
                ", leaveTime=" + leaveTime +
                ", memberCount=" + memberCount.toString() +
                '}';
    }
}
