package com.InfyTel.service;
import java.util.List;

import com.InfyTel.repository.CustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.InfyTel.domain.Customer;
import com.InfyTel.dto.CustomerDTO;
import com.InfyTel.repository.CustomerRepository;
import org.springframework.transaction.annotation.Transactional;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepository  repository;



    @Autowired
    private CustomerRepositoryImpl repimpl;


    @Override
    public void insertCustomer(CustomerDTO customer) {
        repository.saveAndFlush(CustomerDTO.prepareCustomerEntity(customer));
    }

    @Override
    public List<Customer> searchCustomer(String name, String address, Character gender, Integer age) {
        return repimpl.searchCustomer(name, address, gender, age);
    }
}
