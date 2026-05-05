package com.example.zomato.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryPartnerRequest {
    private String name;

    private long mobNo;

    private String vehicleNo;
}
