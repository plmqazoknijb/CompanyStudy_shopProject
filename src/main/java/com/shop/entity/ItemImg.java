package com.shop.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
<<<<<<< HEAD
@Table(name="item_img")
=======
@Table(name = "item_img")
>>>>>>> origin/master
@Getter @Setter
public class ItemImg extends BaseEntity{

    @Id
<<<<<<< HEAD
    @Column(name="item_img_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String imgName;  //이미지파일명

    private String oriImgName;  //원본 이미지 파일명

    private String imgUrl;  //이미지 조회 경로

    private String repimgYn; //대표 이미지 여부
=======
    @Column(name = "item_img_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String imgName;

    private String oriImgName;

    private String imgUrl;

    private String repimgYn;
>>>>>>> origin/master

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

<<<<<<< HEAD
    public void updateItemImg(String oriImgName, String imgName, String imgUrl){
        this.oriImgName = oriImgName;
        this.imgName = imgName;
        this.imgUrl = imgUrl;
    }

}
=======
    public void updateItemImg(String orImgName, String imgName, String imgUrl){
        this.oriImgName = orImgName;
        this.imgName = imgName;
        this.imgUrl = imgUrl;
    }
}
>>>>>>> origin/master
