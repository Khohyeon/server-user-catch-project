//package com.side.serverusercatchproject.entity;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import org.hibernate.annotations.Comment;
//
//@Entity
//@Getter
//@Setter
//@Table(name = "Enterprise_store_menu")
//@NoArgsConstructor
//public class EnterpriseStoreMenu {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Comment("고유번호")
//    private Long id;
//    @Comment("매장 정보")
//    private EnterpriseStoreInfo enterpriseStoreInfo;
//    @Comment("메뉴 이름")
//    private String name;
//    @Comment("메뉴 가격")
//    private String price;
//    @Comment("메뉴 사진")
//    private FileInfo thumbnail;
//    @Comment("메뉴 설명")
//    private String description;
//    @Comment("메뉴 활성화 상태")
//    private String status;
//}
