package com.jhblog.admin.web.post.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Getter
public class PostsUpdateRequestDto {

    private String title;
    private String detail;
    private String udtId;
    private Date udtDt;

    @Builder
    public PostsUpdateRequestDto(String title, String detail, String udtId, Date udtDt) {
        this.title = title;
        this.detail = detail;
        this.udtId = udtId;
        this.udtDt = udtDt;
    }
}
