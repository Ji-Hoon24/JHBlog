package com.jhblog.admin.web.post.dto;

import com.jhblog.admin.domain.post.Posts;
import lombok.Getter;

import java.util.Date;

@Getter
public class PostsResponseJPADto {

    private Integer seqNo;
    private String title;
    private String detail;
    private Integer viewCnt;
    private String regId;
    private String udtId;

    public PostsResponseJPADto(Posts entity) {
        this.seqNo = entity.getSeqNo();
        this.title = entity.getTitle();
        this.detail = entity.getDetail();
        this.viewCnt = entity.getViewCnt();
        this.regId = entity.getRegId();
        this.udtId = entity.getUdtId();
    }
}
