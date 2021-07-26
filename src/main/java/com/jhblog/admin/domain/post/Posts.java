package com.jhblog.admin.domain.post;

import com.jhblog.admin.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seqNo;

    @Column(length = 100, nullable = true)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = true)
    private String detail;

    @Column
    private Integer viewCnt;

    @Column
    private java.util.Date regDt;

    @Column
    private String regId;

    @Column
    private Date udtDt;

    @Column
    private String udtId;

    @Builder
    public Posts(String title, String detail, Integer viewCnt, Date regDt, String regId, Date udtDt, String udtId) {
        this.title = title;
        this.detail = detail;
        this.viewCnt = viewCnt;
        this.regDt = regDt;
        this.regId = regId;
        this.udtDt = udtDt;
        this.udtId = udtId;
    }

    public void update(String title, String detail, String udtId, Date udtDt) {
        this.title = title;
        this.detail = detail;
        this.udtId = udtId;
        this.udtDt = udtDt;
    }

}
