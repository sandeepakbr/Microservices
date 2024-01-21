package com.microservices.account.shared;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Auditable<U> implements AuditorAware<U>{

	@CreatedDate
	@Column(name="CREATED_DATE",insertable=true,updatable=false)
	private LocalDateTime createdDate;
	@CreatedBy
	@Column(name="CREATED_BY",insertable=false,updatable=true)
	private U createdBy;
	@Column(name="MODIFIED_DATE" ,insertable=true,updatable=false)
	@LastModifiedDate
	private LocalDateTime modifiedDate;
	@LastModifiedBy
	@Column(name="MODIFIED_BY",insertable=false,updatable=true)
	private U modifiedBy;
	@Override
	public Optional<U> getCurrentAuditor() {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
