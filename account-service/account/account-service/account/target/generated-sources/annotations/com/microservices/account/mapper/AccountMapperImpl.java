package com.microservices.account.mapper;

import com.microservices.account.dto.AccountDTO;
import com.microservices.account.entity.Account;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-22T00:22:58+0530",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 1.4.50.v20210914-1429, environment: Java 18.0.1 (Eclipse Adoptium)"
)
@Component
public class AccountMapperImpl implements AccountMapper {

    @Override
    public Set<Account> toEntity(Set<AccountDTO> dto) {
        Set<Account> target = fixLazyLoadingSet( dto, Set.class );
        if ( target != null ) {
            return target;
        }

        if ( dto == null ) {
            return null;
        }

        Set<Account> set = new LinkedHashSet<Account>( Math.max( (int) ( dto.size() / .75f ) + 1, 16 ) );
        for ( AccountDTO accountDTO : dto ) {
            set.add( accountDTOToAccount( accountDTO ) );
        }

        return set;
    }

    @Override
    public Set<AccountDTO> toDto(Set<Account> entity) {
        Set<AccountDTO> target = fixLazyLoadingSet( entity, Set.class );
        if ( target != null ) {
            return target;
        }

        if ( entity == null ) {
            return null;
        }

        Set<AccountDTO> set = new LinkedHashSet<AccountDTO>( Math.max( (int) ( entity.size() / .75f ) + 1, 16 ) );
        for ( Account account : entity ) {
            set.add( accountToAccountDTO( account ) );
        }

        return set;
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

    protected AccountDTO accountToAccountDTO(Account account) {
        if ( account == null ) {
            return null;
        }

        AccountDTO accountDTO = new AccountDTO();

        if ( account.getAccountBalance() != null ) {
            accountDTO.setAccountBalance( account.getAccountBalance() );
        }
        if ( account.getAccountHolderName() != null ) {
            accountDTO.setAccountHolderName( account.getAccountHolderName() );
        }
        if ( account.getAccountNumber() != null ) {
            accountDTO.setAccountNumber( account.getAccountNumber() );
        }
        if ( account.getAccountType() != null ) {
            accountDTO.setAccountType( account.getAccountType() );
        }
        if ( account.getCustomerId() != null ) {
            accountDTO.setCustomerId( account.getCustomerId() );
        }

        return accountDTO;
    }
}
