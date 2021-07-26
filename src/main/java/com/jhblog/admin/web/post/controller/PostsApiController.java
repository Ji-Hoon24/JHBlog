package com.jhblog.admin.web.post.controller;

import com.jhblog.admin.web.post.dto.PostsResponseDto;
import com.jhblog.admin.web.post.dto.PostsSaveRequestDto;
import com.jhblog.admin.web.post.dto.PostsUpdateRequestDto;
import com.jhblog.admin.web.post.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Integer save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Integer update(@PathVariable Integer id, @RequestBody PostsUpdateRequestDto dto) {
        return postsService.update(id, dto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById (@PathVariable Integer id) throws Exception {
        return postsService.findById(id);
    }
}
