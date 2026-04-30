package com.example.zomato.models;

import com.example.zomato.models.enums.Gender;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Email
    @Column(unique = true,nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(unique = true,nullable = false)
    private long mobNo;

    private String address;


    @OneToMany(mappedBy = "customer")
    private List<FoodOrder> foodOrders;


}
