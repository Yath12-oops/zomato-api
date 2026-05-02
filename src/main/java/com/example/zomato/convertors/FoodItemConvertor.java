package com.example.zomato.convertors;

import com.example.zomato.dto.request.FoodItemRequest;
import com.example.zomato.dto.response.FoodItemResponse;
import com.example.zomato.models.FoodItem;

import java.util.ArrayList;

public class FoodItemConvertor {

    public static FoodItem foodItemRequestToFoodItem(FoodItemRequest foodItemRequest){

        return FoodItem.builder()
                .name(foodItemRequest.getName())
                .price(foodItemRequest.getPrice())
                .foodCategory(foodItemRequest.getFoodCategory())
                .veg(foodItemRequest.isVeg())
                .foodOrders(new ArrayList<>())
                .build();
    }

    public static FoodItemResponse foodItemtoFoodItemResponse(FoodItem foodItem){
        return FoodItemResponse.builder()
                .name(foodItem.getName())
                .foodCategory(foodItem.getFoodCategory())
                .price(foodItem.getPrice())
                .veg(foodItem.isVeg())
                .build();
    }
}
