package com.example.zomato.repository;

import com.example.zomato.models.DeliveryPartner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryPartnerRepo extends JpaRepository<DeliveryPartner,Integer> {
}
