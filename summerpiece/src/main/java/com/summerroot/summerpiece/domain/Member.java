package com.summerroot.summerpiece.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity @Getter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private int no;

    private String email;
    private String pwd;
    private String name;
    private String nickname;
    private String phone;
    private LocalDateTime enrollDate;

    @Enumerated(EnumType.STRING)
    private MemberStatus status;
}
