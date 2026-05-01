package com.example.zomato.service;

import com.example.zomato.convertors.CustomerConvertor;
import com.example.zomato.dto.request.CustomerRequest;
import com.example.zomato.dto.response.CustomerResponse;
import com.example.zomato.models.Customer;
import com.example.zomato.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    public CustomerResponse addCustomer(CustomerRequest customerRequest) {
        Customer customer= CustomerConvertor.customerRequestToCustomer(customerRequest);
        Customer savedCustomer=customerRepo.save(customer);
        return CustomerConvertor.customerToCustomerResponse(savedCustomer);
    }
}
