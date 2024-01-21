package com.microservices.account.mapper;

import com.microservices.account.dto.AccountDTO;
import com.microservices.account.dto.AccountResponseDTO;
import com.microservices.account.dto.CustomerDTO;
import com.microservices.account.dto.CustomerResponseDTO;
import com.microservices.account.entity.Account;
import com.microservices.account.entity.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-22T00:22:57+0530",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 1.4.50.v20210914-1429, environment: Java 18.0.1 (Eclipse Adoptium)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Customer toEntity(CustomerDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Customer customer = new Customer();

        if ( dto.getCustomerId() != null ) {
            customer.setCustomerId( dto.getCustomerId() );
        }
        if ( dto.getCustomerName() != null ) {
            customer.setCustomerName( dto.getCustomerName() );
        }
        if ( dto.getCustomerEmail() != null ) {
            customer.setCustomerEmail( dto.getCustomerEmail() );
        }
        if ( dto.getCustomerAddress() != null ) {
            customer.setCustomerAddress( dto.getCustomerAddress() );
        }
        List<Account> list = accountDTOListToAccountList( dto.getAccount() );
        if ( list != null ) {
            customer.setAccount( list );
        }

        return customer;
    }

    @Override
    public CustomerResponseDTO toDto(Customer entity) {
        if ( entity == null ) {
            return null;
        }

        CustomerResponseDTO customerResponseDTO = new CustomerResponseDTO();

        if ( entity.getCustomerName() != null ) {
            customerResponseDTO.setCustomerName( entity.getCustomerName() );
        }
        if ( entity.getCustomerEmail() != null ) {
            customerResponseDTO.setCustomerEmail( entity.getCustomerEmail() );
        }
        if ( entity.getCustomerAddress() != null ) {
            customerResponseDTO.setCustomerAddress( entity.getCustomerAddress() );
        }
        List<AccountResponseDTO> list = accountListToAccountResponseDTOList( entity.getAccount() );
        if ( list != null ) {
            customerResponseDTO.setAccount( list );
        }

        return customerResponseDTO;
    }

    protected Account accountDTOToAccount(AccountDTO accountDTO) {
        if ( accountDTO == null ) {
            return null;
        }

        Account account = new Account();

        if ( accountDTO.getCustomerId() != null ) {
            account.setCustomerId( accountDTO.getCustomerId() );
        }
        if ( accountDTO.getAccountType() != null ) {
            account.setAccountType( accountDTO.getAccountType() );
        }
        if ( accountDTO.getAccountHolderName() != null ) {
            account.setAccountHolderName( accountDTO.getAccountHolderName() );
        }
        if ( accountDTO.getAccountNumber() != null ) {
            account.setAccountNumber( accountDTO.getAccountNumber() );
        }
        if ( accountDTO.getAccountBalance() != null ) {
            account.setAccountBalance( accountDTO.getAccountBalance() );
        }

        return account;
    }

    protected List<Account> accountDTOListToAccountList(List<AccountDTO> list) {
        List<Account> target = fixLazyLoadingList( list, List.class );
        if ( target != null ) {
            return target;
        }
        List<Account> target1 = accountMapper.fixLazyLoadingList( list, List.class );
        if ( target1 != null ) {
            return target1;
        }

        if ( list == null ) {
            return null;
        }

        List<Account> list1 = new ArrayList<Account>( list.size() );
        for ( AccountDTO accountDTO : list ) {
            list1.add( accountDTOToAccount( accountDTO ) );
        }

        return list1;
    }

    protected AccountResponseDTO accountToAccountResponseDTO(Account account) {
        if ( account == null ) {
            return null;
        }

        AccountResponseDTO accountResponseDTO = new AccountResponseDTO();

        if ( account.getAccountBalance() != null ) {
            accountResponseDTO.setAccountBalance( account.getAccountBalance() );
        }
        if ( account.getAccountHolderName() != null ) {
            accountResponseDTO.setAccountHolderName( account.getAccountHolderName() );
        }
        if ( account.getAccountNumber() != null ) {
            accountResponseDTO.setAccountNumber( account.getAccountNumber() );
        }
        if ( account.getAccountType() != null ) {
            accountResponseDTO.setAccountType( account.getAccountType() );
        }

        return accountResponseDTO;
    }

    protected List<AccountResponseDTO> accountListToAccountResponseDTOList(List<Account> list) {
        List<AccountResponseDTO> target = fixLazyLoadingList( list, List.class );
        if ( target != null ) {
            return target;
        }
        List<AccountResponseDTO> target1 = accountMapper.fixLazyLoadingList( list, List.class );
        if ( target1 != null ) {
            return target1;
        }

        if ( list == null ) {
            return null;
        }

        List<AccountResponseDTO> list1 = new ArrayList<AccountResponseDTO>( list.size() );
        for ( Account account : list ) {
            list1.add( accountToAccountResponseDTO( account ) );
        }

        return list1;
    }
}
