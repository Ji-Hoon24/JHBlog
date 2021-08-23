package com.jhblog.admin.web.post.dto;

import com.jhblog.admin.domain.post.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class PostsSaveRequestJPADto {
    private String title;
    private String detail;
    private Integer viewCnt;
    private String regId;
    private String udtId;

    @Builder
    public PostsSaveRequestJPADto(String title, String detail, Integer viewCnt, String regId, String udtId) {
        this.title = title;
        this.detail = detail;
        this.viewCnt = viewCnt;
        this.regId = regId;
        this.udtId = udtId;
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .detail(detail)
                .viewCnt(viewCnt)
                .regId(regId)
                .udtId(udtId)
                .build();
    }
}
