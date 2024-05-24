package com.sbs.blog;

import com.sbs.blog.domain.member.service.MemberService;
import com.sbs.blog.domain.post.service.PostService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.time.LocalDateTime;

@SpringBootTest
class BlogApplicationTests {

	@Autowired
	PostService postService;
	MemberService memberService;

	@Test
	void contextLoads() {
		for (int i =0; i<= 30; i++){
			String title = String.format("제목 %d", i);
			String content = String.format("내용 %d", i);
			LocalDateTime createDate = LocalDateTime.now();
			postService.create(createDate, title, content);
		}
	}

	@Test
	void createId() {
		for (int i =0; i<= 30; i++){
			String username = String.format("user%d", i);
			String password = String.format("user%d", i);
			String nickname = String.format("user%d", i);
			String email = String.format("user%d@user.com", i);
			memberService.signup(username, password, nickname,email);
		}
	}
}
