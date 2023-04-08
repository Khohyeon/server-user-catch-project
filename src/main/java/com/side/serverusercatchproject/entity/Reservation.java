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
//@Setter
//@NoArgsConstructor
//@Table(name = "reservation")
//public class Reservation {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.)
//    @Comment("고유번호")
//    private Integer id;
//    @Comment("유저 정보")
//    private Users users;
//    @Comment("사람 수")
//    private int qty;
//    @Comment("매장 정보")
//    private EnterpriseStoreInfo enterpriseStoreInfo;
//    @Comment("예약 간격")
//    private String reservationTerm;
//    @Comment("예약 마감 날짜")
//    private String reservationCancleDay;
//    @Comment("예약 누른 시간")
//    private Timestamp time;
//    @Comment("예약 완료 시간")
//    private Timestamp activeTime;
//}
