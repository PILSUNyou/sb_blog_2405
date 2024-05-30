package com.sbs.blog;

import com.sbs.blog.domain.member.service.MemberService;
import com.sbs.blog.domain.post.entity.Post;
import com.sbs.blog.domain.post.repository.PostRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class BlogApplicationTests {

	@Autowired
	PostRepository postRepository;
	MemberService memberService;

	@Test
	void contextLoads() {
		for (int i =1; i<= 30; i++){
			Post post = Post.builder()
					.title("제목")
					.content("내용")
					.createDate(LocalDateTime.now())
					.thumbnailImg("post/f8295c1c-f13d-4679-b19e-0b6111b5217b.jpg")
					.build();
			postRepository.save(post);
		}
	}

//	@Test
//	void createId() {
//		for (int i =1; i<= 30; i++){
//			String username = String.format("user%d", i);
//			String password = String.format("user%d", i);
//			String nickname = String.format("user%d", i);
//			String email = String.format("user%d@user.com", i);
//			memberService.signup(username, password, nickname, email);
//		}
//	}
}
