package com.summerroot.summerpiece.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity @Getter
public class Project {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private int no;

    private String projectName;

    @ManyToOne(targetEntity = Member.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    private String projectContent;

    @Enumerated(EnumType.STRING)
    private ProjectStatus status;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @Column(insertable = true, updatable = false)
    private LocalDateTime createDate = LocalDateTime.now();

}
