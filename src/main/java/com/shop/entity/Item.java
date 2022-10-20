package com.shop.entity;

import com.shop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

//Item이 데이터 베이스 테이블 역할을 하도록 만드는 어노테이션
@Entity
@Table(name = "item")
@Getter
@Setter
@ToString
public class Item {
    @Id    //Id를 기본키로 사용하겠다는 것
    @Column(name = "item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; //상품코드
    @Column(nullable = false, length = 50)
    private String itemNm; // 상품 이름
    @Column(nullable = false, name="price")
    private int price; //가격
    @Column(nullable = false)
    private int stockNumber; //재고수량
    @Lob
    @Column(nullable = false)
    private String itemDetail; //상품 상세 설명
    @Enumerated(EnumType.STRING)
    private ItemSellStatus itemSellStatus; //상품 판매 상태
    private LocalDateTime regTime; //등록 시간
    private LocalDateTime updateTime; //수정 시간
}
