package com.sbs.blog.domain.post.entity;

import com.sbs.blog.domain.member.entity.Member;
import com.sbs.blog.global.jpa.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Entity
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Post extends BaseEntity {
    private long id;
    private String title;
    private String content;
    private LocalDateTime createDate;
    @ManyToOne
    private Member author;
}
