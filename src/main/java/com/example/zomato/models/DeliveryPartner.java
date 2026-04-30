package com.example.zomato.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class DeliveryPartner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private long mobNo;

    private String vehicleNo;

    private double rating;

    @OneToMany(mappedBy = "deliveryPartner")
    private List<FoodOrder> foodOrders;
}
