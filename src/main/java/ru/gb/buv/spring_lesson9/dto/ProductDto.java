package ru.gb.buv.spring_lesson9.dto;

import lombok.Data;
import ru.gb.buv.spring_lesson9.entity.Product;
//ДТО для общения с клиентом
@Data
public class ProductDto {
    private Long id;
    private String title;
    private Long cost;

    public ProductDto(Product product){
        this.id = product.getId();
        this.title = product.getTitle();
        this.cost = product.getCost();
    }

}
