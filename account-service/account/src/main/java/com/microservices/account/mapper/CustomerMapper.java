package com.microservices.account.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;

import com.microservices.account.HibernateAwareMapper;
import com.microservices.account.dto.CustomerDTO;
import com.microservices.account.dto.CustomerResponseDTO;
import com.microservices.account.entity.Account;
import com.microservices.account.entity.Customer;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,uses= {AccountMapper.class})
public interface CustomerMapper extends HibernateAwareMapper{
	@Mapping(source = "dto.customerId", target = "customerId")
	@Mapping(source = "dto.customerName", target = "customerName")
	@Mapping(source = "dto.customerEmail", target = "customerEmail")
	@Mapping(source = "dto.customerAddress", target = "customerAddress")
	@Mapping(source = "dto.account", target = "account")
	Customer toEntity(CustomerDTO dto);
	
	@Mapping(source = "entity.customerName", target = "customerName")
	@Mapping(source = "entity.customerEmail", target = "customerEmail")
	@Mapping(source = "entity.customerAddress", target = "customerAddress")
	@Mapping(source = "entity.account", target = "account")
	CustomerResponseDTO toDto(Customer entity);
}
