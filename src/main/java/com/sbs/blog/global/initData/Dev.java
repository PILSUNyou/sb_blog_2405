package com.sbs.blog.global.initData;

import com.sbs.blog.domain.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@Profile("dev")
public class Dev {
    @Autowired
    PasswordEncoder passwordEncoder;

    @Bean
    public ApplicationRunner init(MemberService memberService){
        return args -> {
            memberService.signup("admin", "admin", "관리자", "admin@test.com");
            memberService.signup("user1", "user1", "유저1", "user1@test.com");
            memberService.signup("user2", "user2", "유저2", "user2@test.com");
        };
    }
}
