package com.my.blog.domain.Reply;

import com.my.blog.domain.Member.Member;
import com.my.blog.domain.Post.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "Replies")
public class Reply {
    @Id
    @Column(name = "reply_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long replyId;

    @Column(name = "reply_content")
    private String replayContent;

    @Column(name = "board_id")
    @OneToOne(mappedBy = "board_id")
    private Board boardId;

    @Column(name = "member_id")
    @OneToOne(mappedBy = "member_count_id")
    private Member memberId;
}
