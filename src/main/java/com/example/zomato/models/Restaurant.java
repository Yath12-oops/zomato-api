package com.example.zomato.models;

import com.example.zomato.models.enums.RestaurantType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.engine.internal.Cascade;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String location;

    private RestaurantType restaurantType;

    private long contactNo;

    @OneToOne(mappedBy = "restaurant", cascade=CascadeType.ALL)
    private Menu menu;
}
