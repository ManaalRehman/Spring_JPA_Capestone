package com.InfyTel.repository;

import java.util.List;
import com.InfyTel.domain.Customer;
public interface ICustomerRepository {
    public List<Customer> searchCustomer(String name, String address, Character gender, Integer age);
}