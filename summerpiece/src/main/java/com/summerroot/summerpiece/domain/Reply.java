package com.summerroot.summerpiece.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity @Getter
public class Reply {
    @Id @GeneratedValue
    @Column(name = "reply_id")
    private int id;

    private String replyCont;

    @ManyToOne(targetEntity = Member.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member replyWriter;

    @ManyToOne(targetEntity = Board.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board parentBoard;

    @CreatedDate
    private LocalDateTime replyDate;

    @Enumerated(EnumType.STRING)
    private ReplyStatus reStatus;

}
