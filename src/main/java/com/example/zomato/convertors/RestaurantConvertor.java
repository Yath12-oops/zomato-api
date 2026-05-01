package com.example.zomato.convertors;

import com.example.zomato.dto.request.RestaurantRequest;
import com.example.zomato.dto.response.RestaurantResponse;
import com.example.zomato.models.Menu;
import com.example.zomato.models.Restaurant;

public class RestaurantConvertor {

    public static Restaurant restaurantRequestToRestaurant(RestaurantRequest restaurantRequest){
        return Restaurant.builder()
                .name(restaurantRequest.getName())
                .restaurantType(restaurantRequest.getRestaurantType())
                .location(restaurantRequest.getLocation())
                .contactNo(restaurantRequest.getContactNo())
                .menu(new Menu())
                .build();
    }

    public static RestaurantResponse restaurantToRestaurantResponse(Restaurant restaurant){
        return RestaurantResponse.builder()
                .name(restaurant.getName())
                .message("Registration Successful")
                .build();
    }
}
