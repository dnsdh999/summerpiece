package com.summerroot.summerpiece.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class Board {

    @Id @GeneratedValue
    @Column(name = "board_no")
    private int no;

    private String boardTitle;
    private String boardContent;

    private LocalDateTime boardDate;

    // 연관 관계
//    private Member boardWriter;
//    private Project projectNo;

    @Enumerated(EnumType.STRING)
    private BoardStatus status;

}
