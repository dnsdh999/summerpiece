package com.summerroot.summerpiece.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

    @Entity
    @Getter
    public class FileBox {

        @Id
        @GeneratedValue
        @Column(name = "file_no")
        private int fileNo;

        private String filePath;
        private Long fileSize;

        private String fileOriginName;
        private String fileChangeName;

        private LocalDateTime fileUpdateDate;

        // 연관 관계
//    private Project projectNo;

        @ManyToOne
        @JoinColumn(name = "boardId")
        private Board boardNo;

        @Enumerated(EnumType.STRING)
        private FileBoxStatus status;


    }
