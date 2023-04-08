package com.side.serverusercatchproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Setter
@Table(name = "EnterpriseList")
@NoArgsConstructor
@AllArgsConstructor
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("고유번호")
    private Integer id;
    @Comment("기업아이디")
    private String username;
    @Comment("기업비밀번호")
    private String password;
    @Comment("권한")
    private String role;
    @Comment("기업이메일")
    private String email;
    @Comment("기업전화번호")
    private String tel;

}
