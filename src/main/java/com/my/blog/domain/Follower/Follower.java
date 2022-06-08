package com.my.blog.domain.Follower;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "Followers")
public class Follower {

    @Id
    @Column(name = "follwer_id")
    private long followerId;

    @Column(name = "from_member_id")
    private long fromMemberId;

    @Column(name = "to_member_id")
    private long toMemberId;

}
