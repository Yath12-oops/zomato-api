package com.example.zomato.models;

import com.example.zomato.models.enums.FoodCategory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private double price;

    private boolean veg;

    @Enumerated(EnumType.STRING)
    private FoodCategory foodCategory;

    @ManyToOne
    @JoinColumn(name="menu_id")
    @JsonIgnore
    private Menu menu;

    @ManyToMany(mappedBy = "foodItems")
    private List<FoodOrder> foodOrders;
}
