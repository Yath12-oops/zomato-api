package com.example.zomato.convertors;

import com.example.zomato.dto.request.DeliveryPartnerRequest;
import com.example.zomato.dto.response.DeliveryPartnerResponse;
import com.example.zomato.models.DeliveryPartner;

import java.util.ArrayList;

public class DeliveryPartnerConvertor {

    public static DeliveryPartner deliveryPartnerRequestToDeliveryPartner(DeliveryPartnerRequest deliveryPartnerRequest){
        return DeliveryPartner.builder()
                .name(deliveryPartnerRequest.getName())
                .mobNo(deliveryPartnerRequest.getMobNo())
                .vehicleNo(deliveryPartnerRequest.getVehicleNo())
                .rating(1)
                .foodOrders(new ArrayList<>())
                .build();
    }

    public static DeliveryPartnerResponse deliveryPartnerToDeliveryPartnerResponse(DeliveryPartner deliveryPartner){
        return DeliveryPartnerResponse.builder()
                .name(deliveryPartner.getName())
                .vehicleNo(deliveryPartner.getVehicleNo())
                .build();
    }

}
