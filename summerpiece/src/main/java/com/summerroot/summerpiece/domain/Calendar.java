package com.summerroot.summerpiece.domain;

import com.summerroot.summerpiece.converter.BooleanToYNConverter;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity @Getter
public class Calendar {

    @Id @GeneratedValue
    @Column(name = "calendar_id")
    private Long id;

    private LocalDateTime calendarStartDate;
    private LocalDateTime calendarEndDate;
    private LocalDateTime calendarModifyDate;

    @Convert(converter = BooleanToYNConverter.class)
    private boolean isAllDay;

    @Enumerated(EnumType.STRING)
    private CalendarState calendarState;
    private String calendarContent;
    private String calendarColor;

    @ManyToOne(targetEntity = Member.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member calendarWriter;

    public void calendarInfoInit(Member calendarWriter){
        this.calendarModifyDate = LocalDateTime.now();
        this.calendarState = CalendarState.Y;
        this.calendarWriter = calendarWriter;
    }

    public void deleteCalendar(){
        this.calendarState = CalendarState.N;
    }

    public void updateCalendar(Long id){
        this.id = id;
    }
}