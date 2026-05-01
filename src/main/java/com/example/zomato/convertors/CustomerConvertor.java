package com.example.zomato.convertors;

import com.example.zomato.dto.request.CustomerRequest;
import com.example.zomato.dto.response.CustomerResponse;
import com.example.zomato.models.Customer;
import com.example.zomato.repository.CustomerRepo;

import java.util.ArrayList;

public class CustomerConvertor {

    public static Customer customerRequestToCustomer(CustomerRequest customerRequest){
        return Customer.builder()
                .name(customerRequest.getName())
                .email(customerRequest.getEmail())
                .gender(customerRequest.getGender())
                .mobNo(customerRequest.getMobNo())
                .address(customerRequest.getAddress())
                .foodOrders(new ArrayList<>())
                .build();
    }

    public static CustomerResponse customerToCustomerResponse(Customer customer){
        return CustomerResponse.builder()
                .name(customer.getName())
                .message("Registration successful")
                .build();
    }
}
