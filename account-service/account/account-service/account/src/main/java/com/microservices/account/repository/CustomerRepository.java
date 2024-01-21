package com.microservices.account.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.microservices.account.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,String> {

	
	@Query("SELECT c from Customer c where c.customerEmail= :customerEmail and c.customerName= :customerName")
	Optional<Customer> findByCustomerEmailAndName(String customerEmail,String customerName);

}
