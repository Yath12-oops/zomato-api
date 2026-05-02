package com.example.zomato.dto.response;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MenuResponse {

    private String restaurantName;

    private List<FoodItemResponse> foodItems;
}
