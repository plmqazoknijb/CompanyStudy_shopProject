package com.shop.dto;

import com.shop.constant.ItemSellStatus;
import com.shop.entity.Item;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

<<<<<<< HEAD
import javax.validation.constraints.NotEmpty;
=======
import javax.validation.constraints.NotBlank;
>>>>>>> origin/master
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class ItemFormDto {
<<<<<<< HEAD

    private Long id;

    @NotEmpty(message = "상품명은 필수 입력 값입니다.")
=======
    private Long id;

    @NotBlank(message = "상품명은 필수 입력 값입니다.")
>>>>>>> origin/master
    private String itemNm;

    @NotNull(message = "가격은 필수 입력 값입니다.")
    private Integer price;

<<<<<<< HEAD
    @NotEmpty(message = "이름은 필수 입력 값입니다.")
=======
    @NotBlank(message = "이름은 필수 입력 값입니다.")
>>>>>>> origin/master
    private String itemDetail;

    @NotNull(message = "재고는 필수 입력 값입니다.")
    private Integer stockNumber;

    private ItemSellStatus itemSellStatus;

    private List<ItemImgDto> itemImgDtoList = new ArrayList<>();

    private List<Long> itemImgIds = new ArrayList<>();

    private static ModelMapper modelMapper = new ModelMapper();

    public Item createItem(){
        return modelMapper.map(this, Item.class);
    }
<<<<<<< HEAD

    public static ItemFormDto of(Item item){
        return modelMapper.map(item,ItemFormDto.class);
    }

}
=======
    public static ItemFormDto of(Item item){
        return modelMapper.map(item, ItemFormDto.class);
    }
}
>>>>>>> origin/master
