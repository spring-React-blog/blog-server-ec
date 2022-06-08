package com.my.blog.domain.Post;

import com.my.blog.domain.Member.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "Categories")
public class Category {

    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long categoryId;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "member_id")
    @OneToOne(mappedBy = "member_id")
    private Member memberId;
}
