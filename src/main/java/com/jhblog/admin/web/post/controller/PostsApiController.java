package com.jhblog.admin.web.post.controller;

import com.jhblog.admin.web.post.dto.PostsResponseJPADto;
import com.jhblog.admin.web.post.dto.PostsSaveRequestJPADto;
import com.jhblog.admin.web.post.dto.PostsUpdateRequestJPADto;
import com.jhblog.admin.web.post.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Integer save(@RequestBody PostsSaveRequestJPADto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Integer update(@PathVariable Integer id, @RequestBody PostsUpdateRequestJPADto dto) {
        return postsService.update(id, dto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseJPADto findById (@PathVariable Integer id) throws Exception {
        return postsService.findById(id);
    }
}
