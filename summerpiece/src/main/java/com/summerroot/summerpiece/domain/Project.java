package com.summerroot.summerpiece.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
public class Project {

    @Id @GeneratedValue
    @Column(name = "project_id")
    private int no;
    private String projectName;

    // FK 처리
//    private Member member;

    private String projectContent;

    @Enumerated(EnumType.STRING)
    private ProjectStatus status;

    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private LocalDateTime createDate;

}
