package com.jhblog.admin.web.post.service;

import com.jhblog.admin.domain.post.Posts;
import com.jhblog.admin.domain.post.PostsRepository;
import com.jhblog.admin.web.post.dto.PostsResponseJPADto;
import com.jhblog.admin.web.post.dto.PostsSaveRequestJPADto;
import com.jhblog.admin.web.post.dto.PostsUpdateRequestJPADto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Integer save(PostsSaveRequestJPADto dto) {
        return postsRepository.save(dto.toEntity()).getSeqNo();
    }

    @Transactional
    public Integer update(Integer id, PostsUpdateRequestJPADto dto) {
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        posts.update(dto.getTitle(), dto.getDetail(), dto.getUdtId());
        return id;
    }

    public PostsResponseJPADto findById (Integer id) {
        Posts entity = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        return new PostsResponseJPADto(entity);
    }


}
