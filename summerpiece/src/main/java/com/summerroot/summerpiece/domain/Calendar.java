package com.summerroot.summerpiece.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity @Getter
public class Calendar {

    @Id @GeneratedValue
    @Column(name = "calendar_id")
    private int id;

    private LocalDateTime calendarStartDate;
    private LocalDateTime calendarEndDate;
    private LocalDateTime calendarModifyDate;

    @Enumerated(EnumType.STRING)
    private CalendarState calendarState;
    private String calendarContent;
    private String calendarColor;

    @ManyToOne(targetEntity = Member.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member calendarWriter;

}