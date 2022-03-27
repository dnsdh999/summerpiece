package com.summerroot.summerpiece.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
public class Reply {
    @Id @GeneratedValue
    @Column(name = "reply_no")
    private int no;

    private String replyCont;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "email")
//    private Member replyWriter;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "board_no")
//    private Board boardNo;

    private LocalDateTime replyDate;
    @Enumerated(EnumType.STRING)
    private ReplyStatus reStatus;

}
