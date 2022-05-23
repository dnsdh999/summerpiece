package com.summerroot.summerpiece.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/** by 민정 : 폼으로 받을 회원정보를 매핑 시켜줄 객체를 만드는 작업
* */
@Getter
@Setter
public class MemberDto {
    private String email;
    private String pwd;
    private String name;
    private String nickname;
    private String phone;
    private LocalDateTime enrollDate;

    private String auth;
}
