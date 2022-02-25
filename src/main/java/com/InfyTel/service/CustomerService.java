package com.InfyTel.service;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import com.InfyTel.domain.Customer;
import com.InfyTel.dto.CustomerDTO;

public interface CustomerService {

    public void insertCustomer(CustomerDTO Customer) ;
    public List<Customer> searchCustomer(String name, String address, Character gender, Integer age) ;


}
