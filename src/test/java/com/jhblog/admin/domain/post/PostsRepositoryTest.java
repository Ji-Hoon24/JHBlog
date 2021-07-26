package com.jhblog.admin.domain.post;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanup() {
        postsRepository.deleteAll();
    }

    @Test
    public void board_load() {
        String title = "테스트 제목 6";
        String detail = "테스트 내용 6";

        postsRepository.save(Posts.builder()
            .title(title)
            .detail(detail)
            .viewCnt(0)
            .regDt(new Date())
            .regId("admin")
            .udtDt(new Date())
            .udtId("admin")
            .build());

        List<Posts> postsList = postsRepository.findAll();

        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getDetail()).isEqualTo(detail);
    }
}
