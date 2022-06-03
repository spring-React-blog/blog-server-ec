package com.my.blog.domain.dto;

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

    @Column(name = "category_id")
    @OneToOne(mappedBy = "category_id")
    private Category category;

    @Column(name = "member_id")
    @OneToOne(mappedBy = "member_id")
    private Member member;
}
