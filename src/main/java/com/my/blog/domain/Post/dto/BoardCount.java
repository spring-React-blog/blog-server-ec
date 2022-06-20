package com.my.blog.domain.Post.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "BoardCounts")
public class BoardCount {

    @Id
    @Column(name = "board_count_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long boardCountId;

    @Column(name = "view_count")
    private long viewCount;

    @Column(name = "like_count")
    private int likeCount;

    @Column(name = "reply_count")
    private int replyCount;

}
