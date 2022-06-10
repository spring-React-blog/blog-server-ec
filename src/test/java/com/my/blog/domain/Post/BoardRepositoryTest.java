package com.my.blog.domain.Post;

import com.my.blog.BlogServerEcApplication;
import com.my.blog.domain.Member.Member;
import com.my.blog.domain.Member.MemberCount;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
public class BoardRepositoryTest extends BlogServerEcApplication {
    @Autowired
    private BoardRepository boardRepository;

    @After
    public void cleanup() {
        boardRepository.deleteAll();
    }

    @Test
    public void insert() {
        LocalDateTime now = LocalDateTime.now();
        Board board = Board.builder()
                .title("TITLE")
                .openstatus(true)
                .build();

        boardRepository.save(board);

        Board boards = boardRepository.findAll().get(0);
        assertThat(boards.getTitle()).isEqualTo("TITLE");
        assertThat(boards.getCreatedDate().isAfter(now));
    }
}