package com.my.blog.domain.Post;

import com.my.blog.domain.Member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
