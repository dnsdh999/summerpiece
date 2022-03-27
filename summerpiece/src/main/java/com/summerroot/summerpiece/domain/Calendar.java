package com.summerroot.summerpiece.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity // 이게 맞나....?
@Table(name = "calendar") // 이건..??
@Getter
public class Calendar {

    @Id @GeneratedValue
    @Column(name = "calendar_no")
    private int calendarNo;

    private LocalDateTime calendarStartDate;
    private LocalDateTime calendarEndDate;
    private LocalDateTime calendarModifyDate;

    @Enumerated(EnumType.STRING)
    private String calendarState;

    private String calendarContent;

    @ManyToOne(fetch = FetchType.LAZY) // 이건....?
    @JoinColumn(name = "project_no")
    private Project project; // 이건..? //프로젝트에 oneToMany 추가..?

}