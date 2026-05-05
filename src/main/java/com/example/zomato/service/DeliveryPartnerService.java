package com.example.zomato.service;

import com.example.zomato.convertors.DeliveryPartnerConvertor;
import com.example.zomato.dto.request.DeliveryPartnerRequest;
import com.example.zomato.dto.response.DeliveryPartnerResponse;
import com.example.zomato.models.DeliveryPartner;
import com.example.zomato.repository.DeliveryPartnerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeliveryPartnerService {

    private final DeliveryPartnerRepo deliveryPartnerRepo;

    public DeliveryPartnerResponse addDeliveryPartner(DeliveryPartnerRequest deliveryPartnerRequest) {
        DeliveryPartner partner= DeliveryPartnerConvertor.deliveryPartnerRequestToDeliveryPartner(deliveryPartnerRequest);
        DeliveryPartner saved=deliveryPartnerRepo.save(partner);
        return DeliveryPartnerConvertor.deliveryPartnerToDeliveryPartnerResponse(saved);
    }
}
