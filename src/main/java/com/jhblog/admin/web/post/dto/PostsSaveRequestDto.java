package com.jhblog.admin.web.post.dto;

import com.jhblog.admin.domain.post.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String detail;
    private Integer viewCnt;
    private Date regDt;
    private String regId;
    private Date udtDt;
    private String udtId;

    @Builder
    public PostsSaveRequestDto(String title, String detail, Integer viewCnt, Date regDt, String regId, Date udtDt, String udtId) {
        this.title = title;
        this.detail = detail;
        this.viewCnt = viewCnt;
        this.regDt = regDt;
        this.regId = regId;
        this.udtDt = udtDt;
        this.udtId = udtId;
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .detail(detail)
                .viewCnt(viewCnt)
                .regDt(regDt)
                .regId(regId)
                .udtDt(udtDt)
                .udtId(udtId)
                .build();
    }
}
