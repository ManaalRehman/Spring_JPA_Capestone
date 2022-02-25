package com.InfyTel.repository;

import com.InfyTel.domain.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Service;

@Service
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
