package com.jhblog.admin.web.post.dto;

import com.jhblog.admin.domain.post.Posts;
import lombok.Getter;

import java.util.Date;

@Getter
public class PostsResponseDto {

    private Integer seqNo;
    private String title;
    private String detail;
    private Integer viewCnt;
    private Date regDt;
    private String regId;
    private Date udtDt;
    private String udtId;

    public PostsResponseDto(Posts entity) {
        this.seqNo = entity.getSeqNo();
        this.title = entity.getTitle();
        this.detail = entity.getDetail();
        this.viewCnt = entity.getViewCnt();
        this.regDt = entity.getRegDt();
        this.regId = entity.getRegId();
        this.udtDt = entity.getUdtDt();
        this.udtId = entity.getUdtId();
    }
}
