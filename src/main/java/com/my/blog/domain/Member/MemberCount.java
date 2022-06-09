package com.my.blog.domain.Member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "MemberCounts")
public class MemberCount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_count_id")
    private int memberCountId;

    @Column(name = "follower_count")
    private int followerCount;

    @Column(name = "following_count")
    private int followingCount;

    @Column(name = "board_count")
    private int boardCount;

    @Builder
    public MemberCount(int followerCount, int followingCount, int boardCount) {
        this.followerCount = followerCount;
        this.followingCount = followingCount;
        this.boardCount = boardCount;
    }
}
