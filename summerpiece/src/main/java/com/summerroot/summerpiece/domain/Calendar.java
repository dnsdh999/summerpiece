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
    private String calendarColor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_no")
    private Member member;

}