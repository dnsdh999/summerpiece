package com.summerroot.summerpiece.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// by 민정. Board 엔티티
@Entity
@Getter
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private int id;

    private String boardTitle;
    private String boardContent;

    @Column(insertable = true, updatable = false)
    private LocalDateTime boardDate = LocalDateTime.now();

    @ManyToOne(targetEntity = Member.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member boardWriter;

    @ManyToOne(targetEntity = Project.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project;

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
    private List<FileBox> fileBoxes = new ArrayList<>();

    @OneToMany(mappedBy = "parentBoard", cascade = CascadeType.ALL)
    private List<Reply> replies = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private BoardStatus status;

}
