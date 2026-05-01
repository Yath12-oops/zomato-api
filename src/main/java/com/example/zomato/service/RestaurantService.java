package com.example.zomato.service;

import com.example.zomato.convertors.RestaurantConvertor;
import com.example.zomato.dto.request.RestaurantRequest;
import com.example.zomato.dto.response.RestaurantResponse;
import com.example.zomato.models.Restaurant;
import com.example.zomato.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;

    public RestaurantResponse addRestaurant(RestaurantRequest restaurantRequest){
        Restaurant restaurant= RestaurantConvertor.restaurantRequestToRestaurant(restaurantRequest);
        Restaurant savedRestaurant=restaurantRepo.save(restaurant);
        return RestaurantConvertor.restaurantToRestaurantResponse(savedRestaurant);
    }
}
