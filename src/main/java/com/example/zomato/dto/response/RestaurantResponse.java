package com.example.zomato.dto.response;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class RestaurantResponse {

    private String name;
    private String message;
}
