package com.my.blog.domain.Post.dto;

import com.my.blog.domain.Member.domain.vo.Member;
import com.my.blog.domain.Post.domain.vo.Category;
import com.my.blog.global.util.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "Boards")
public class Board extends BaseTimeEntity {

    @Id
    @Column(name = "board_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "board_img")
    private String boardImg;

    @Column(name = "open_status")
    private boolean openStatus;

    @JoinColumn(name = "Members")
    @OneToOne
    private Member member;

    @JoinColumn(name = "BoardCounts")
    @OneToOne
    private BoardCount boardCount;

    @JoinColumn(name = "Categories")
    @OneToOne
    private Category category;

    @Builder
    public Board(String title, String content, String boardImg, boolean openstatus, Member member, BoardCount boardCount, Category category) {
        this.title = title;
        this.content = content;
        this.boardImg = boardImg;
        this.openStatus = openstatus;
        this.member = member;
        this.boardCount = boardCount;
        this.category = category;
    }

}
