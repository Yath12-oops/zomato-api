package com.example.zomato.controller;

import com.example.zomato.dto.request.DeliveryPartnerRequest;
import com.example.zomato.dto.response.DeliveryPartnerResponse;
import com.example.zomato.service.DeliveryPartnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/partner")
@RequiredArgsConstructor
public class DeliveryPartnerController {

    private final DeliveryPartnerService deliveryPartnerService;

    @PostMapping
    public ResponseEntity addDeliveryPartner(@RequestBody DeliveryPartnerRequest deliveryPartnerRequest){
        DeliveryPartnerResponse response=deliveryPartnerService.addDeliveryPartner(deliveryPartnerRequest);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }
}
