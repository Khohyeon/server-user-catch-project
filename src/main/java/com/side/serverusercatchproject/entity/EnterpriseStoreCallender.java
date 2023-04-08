//package com.side.serverusercatchproject.entity;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import org.hibernate.annotations.Comment;
//
//import java.sql.Timestamp;
//import java.util.Date;
//
//@Entity
//@Getter
//@Setter
//@Table(name = "Enterprise_store_callender")
//@NoArgsConstructor
//public class EnterpriseStoreCallender {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Comment("고유번호")
//    private Integer id;
//    @Comment("매장 정보")
//    private EnterpriseStoreInfo enterpriseStoreInfo;
//    @Comment("요일")
//    private Date day;
//    @Comment("오픈 시간")
//    private Timestamp startTime;
//    @Comment("마감 시간")
//    private Timestamp endTime;
//    @Comment("쉬는 시간 시작")
//    private Timestamp startBreakTime;
//    @Comment("쉬는 시간 끝~~")
//    private Timestamp endBreakTime;
//    @Comment("매장 열림/닫힘")
//    private boolean isOpen;
//
//}
