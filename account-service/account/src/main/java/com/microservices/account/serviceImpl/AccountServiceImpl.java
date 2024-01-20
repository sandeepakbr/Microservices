package com.microservices.account.serviceImpl;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.account.dto.AccountDTO;
import com.microservices.account.dto.CustomerDTO;
import com.microservices.account.entity.Account;
import com.microservices.account.entity.Customer;
import com.microservices.account.exception.AccountCreationException;
import com.microservices.account.mapper.AccountMapper;
import com.microservices.account.mapper.CustomerMapper;
import com.microservices.account.repository.AccountRepository;
import com.microservices.account.repository.CustomerRepository;
import com.microservices.account.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
 
	@Autowired
	private AccountRepository accRepo;
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	private AccountMapper accMapper;
	
	@Autowired
	private CustomerMapper customerMapper;
	
	@Override
	public void createCustomer(CustomerDTO dto) {
		
		Optional<Customer> isCustomerExist = customerRepo.findByCustomerEmailAndName(dto.getCustomerEmail(),dto.getCustomerName());
		
		if(isCustomerExist != null) {
			throw new AccountCreationException("Customer Allready exist for this Email: "+dto.getCustomerEmail()+"and Name: "+dto.getCustomerName());
		}else {
			Customer customer = customerRepo.save(customerMapper.toEntity(dto));
			Set<Account> acc= createAccount(customer);
			customer.setAccount(acc);
		}
	}

	private Set<Account> createAccount(Customer customer) {
        	Set<AccountDTO> accDto = new HashSet<AccountDTO>();
            
        	for(Account acc : customer.getAccount()) {
        		acc.setCustomerId(customer.getCustomerId());
        	}
        	
        	Set<Account> account = accRepo.save(accMapper.toEntity(accDto));
        	return account;
	}
}
