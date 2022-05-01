package com.summerroot.summerpiece.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

// by 민정. Board 엔티티
@Entity
@Getter
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_no")
    private int no;

    private String boardTitle;
    private String boardContent;

    @Column(insertable = true, updatable = false)
    private LocalDateTime boardDate = LocalDateTime.now();

    @ManyToOne(targetEntity = Member.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member boardWriter;

    @ManyToOne(targetEntity = Project.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project projectNo;

    @Enumerated(EnumType.STRING)
    private BoardStatus status;

}
