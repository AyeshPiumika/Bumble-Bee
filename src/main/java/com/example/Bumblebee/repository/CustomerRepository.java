package com.example.Bumblebee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Bumblebee.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
