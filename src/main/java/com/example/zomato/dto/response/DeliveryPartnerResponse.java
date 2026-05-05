package com.example.zomato.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeliveryPartnerResponse {
    private String name;
    private String vehicleNo;
}
