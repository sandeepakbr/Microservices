package com.microservices.account.mapper;

import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;

import com.microservices.account.HibernateAwareMapper;
import com.microservices.account.dto.AccountDTO;
import com.microservices.account.entity.Account;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,uses= {Account.class})
public interface AccountMapper extends HibernateAwareMapper{

	@Mapping(source = "dto.accountType", target = "accountType")
	@Mapping(source = "dto.accountHolderName", target = "accountHolderName")
	@Mapping(source = "dto.accountNumber", target = "accountNumber")
	@Mapping(source = "dto.accountBalance", target = "accountBalance")
	@Mapping(source = "dto.customerId", target = "customerId")
	Set<Account> toEntity(Set<AccountDTO> dto);
	
	@Mapping(source = "entity.accountType", target = "accountType")
	@Mapping(source = "entity.accountHolderName", target = "accountHolderName")
	@Mapping(source = "entity.accountNumber", target = "accountNumber")
	@Mapping(source = "entity.accountBalance", target = "accountBalance")
	@Mapping(source = "entity.customerId", target = "customerId")
	Set<AccountDTO> toDto(Set<Account> entity);
}
