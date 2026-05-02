package com.example.zomato.dto.request;

import com.example.zomato.models.enums.FoodCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FoodItemRequest {

    private String name;

    private double price;

    private boolean veg;

    private FoodCategory foodCategory;
}
