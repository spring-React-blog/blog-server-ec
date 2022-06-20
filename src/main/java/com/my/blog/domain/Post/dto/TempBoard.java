package com.my.blog.domain.Post.dto;

import com.my.blog.domain.Member.domain.vo.Member;
import com.my.blog.domain.Post.domain.vo.Category;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "TempBoards")
public class TempBoard {

    @Id
    @Column(name = "temp_board_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long tempBoardId;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "board_img")
    private String boardImg;

    @JoinColumn(name = "Categories")
    @OneToOne
    private Category category;

    @JoinColumn(name = "Members")
    @OneToOne
    private Member member;
}
