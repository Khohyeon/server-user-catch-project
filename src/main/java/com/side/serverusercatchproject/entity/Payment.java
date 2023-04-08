//package com.side.serverusercatchproject.entity;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import org.hibernate.annotations.Comment;
//
//import java.sql.Timestamp;
//
//@Entity
//@Getter
//@Table(name = "payments")
//@NoArgsConstructor
//@Setter
//public class Payment {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Comment("고유번호")
//    private Integer id;
//    @Comment("예약 정보")
//    private Reservations reservations;
//    @Comment("결제 금액")
//    private String price;
//    @Comment("결제한 시간")
//    private Timestamp time;
//    @Comment("결제 정보 받는 데이터")
//    private String originDate;
//    @Comment("결제 타입")
//    private String type;
//    @Comment("결제 상태")
//    private String status;
//}
