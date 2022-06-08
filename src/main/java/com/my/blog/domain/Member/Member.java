package com.my.blog.domain.Member;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "MEMBERS")
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

    @OneToOne
    @JoinColumn(name = "member_count_id")
    private MemberCount memberCountId;

}
