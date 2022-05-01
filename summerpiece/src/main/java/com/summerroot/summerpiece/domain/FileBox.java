package com.summerroot.summerpiece.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class FileBox {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "file_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "board_no")
    private Board boardNo;

    @Column(nullable = false)
    private String fileOriginName;

    @Column(nullable = false)
    private String filePath;

    @Column(nullable = false)
    private String fileSavedName;

    private Long fileSize;

    // @CreationTimestamp
    @CreatedDate
    private LocalDateTime fileUpdateDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;

    private String fileType;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member memberNo;

    @Enumerated(EnumType.STRING)
    private FileBoxStatus status;

}
