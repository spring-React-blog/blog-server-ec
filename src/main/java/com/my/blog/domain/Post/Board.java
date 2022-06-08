package com.my.blog.domain.Post;

import com.my.blog.domain.Member.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "Boards")
public class Board {

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

    @Column(name = "board_count_id")
    @OneToOne(mappedBy = "member_id")
    private Member member;

    @Column(name = "board_count_id")
    @OneToOne(mappedBy = "board_count_id")
    private Board boardCountId;

    @Column(name = "category_id")
    @OneToOne(mappedBy = "category_id")
    private Category categoryId;


}
