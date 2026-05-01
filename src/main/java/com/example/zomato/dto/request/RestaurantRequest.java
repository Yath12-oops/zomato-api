package com.example.zomato.dto.request;

import com.example.zomato.models.enums.RestaurantType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantRequest {
    private String name;

    private String location;

    private RestaurantType restaurantType;

    private long contactNo;
}
