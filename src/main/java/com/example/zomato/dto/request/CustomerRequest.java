package com.example.zomato.dto.request;

import com.example.zomato.models.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequest {

    private String name;
    private String email;
    private Gender gender;
    private long mobNo;
    private String address;
}
