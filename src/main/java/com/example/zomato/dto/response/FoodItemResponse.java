package com.example.zomato.dto.response;

import com.example.zomato.models.enums.FoodCategory;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FoodItemResponse {

    private String name;

    private double price;

    private boolean veg;

    private FoodCategory foodCategory;
}
