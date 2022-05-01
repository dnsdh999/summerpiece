package com.summerroot.summerpiece.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_no")
    private int no;

    private String boardTitle;
    private String boardContent;

    @Column(insertable = true, updatable = false) // update시에는 DB에 저장하지 않음
    private LocalDateTime boardDate = LocalDateTime.now(); // 현재시간으로 설정 

    @ManyToOne(targetEntity = Member.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "member-id")
    private Member boardWriter;

    @ManyToOne(targetEntity = Project.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project projectNo;

    @Enumerated(EnumType.STRING)
    private BoardStatus status;

}
