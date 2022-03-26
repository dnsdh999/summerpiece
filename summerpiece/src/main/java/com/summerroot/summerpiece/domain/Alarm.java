package com.summerroot.summerpiece.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
public class Alarm {

    @Id @GeneratedValue
    @Column(name = "alarm_no")
    private int alarmNo;

    private int alarmType;

    private String alarmContent;

    @Enumerated(EnumType.STRING)
    private String alarmStatus;

    private String recipient;

    private LocalDateTime alarmDate;

    @JoinColumn(name = "project_no")
    private int projectNo;
}
