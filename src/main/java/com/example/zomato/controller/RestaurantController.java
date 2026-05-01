package com.example.zomato.controller;

import com.example.zomato.dto.request.RestaurantRequest;
import com.example.zomato.dto.response.RestaurantResponse;
import com.example.zomato.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/restaurant")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @PostMapping
    public ResponseEntity<RestaurantResponse> addRestaurant(@RequestBody RestaurantRequest restaurantRequest){
        RestaurantResponse response=restaurantService.addRestaurant(restaurantRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
