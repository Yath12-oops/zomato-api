package com.example.zomato.models;


import com.example.zomato.models.enums.OrderStatus;
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
public class FoodOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double totalValue;

    private OrderStatus orderStatus;

    @ManyToOne
    @JoinColumn(name="customer_id")
    @JsonIgnore
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "delivery_partner_id")
    @JsonIgnore
    private DeliveryPartner deliveryPartner;

    @ManyToMany
    @JoinTable
    @JsonIgnore
    private List<FoodItem> foodItems;
}
