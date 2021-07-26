package com.jhblog.admin.web.post.service;

import com.jhblog.admin.domain.post.Posts;
import com.jhblog.admin.domain.post.PostsRepository;
import com.jhblog.admin.web.post.dto.PostsResponseDto;
import com.jhblog.admin.web.post.dto.PostsSaveRequestDto;
import com.jhblog.admin.web.post.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Integer save(PostsSaveRequestDto dto) {
        return postsRepository.save(dto.toEntity()).getSeqNo();
    }

    @Transactional
    public Integer update(Integer id, PostsUpdateRequestDto dto) {
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        posts.update(dto.getTitle(), dto.getDetail(), dto.getUdtId(), dto.getUdtDt());
        return id;
    }

    public PostsResponseDto findById (Integer id) {
        Posts entity = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        return new PostsResponseDto(entity);
    }


}
