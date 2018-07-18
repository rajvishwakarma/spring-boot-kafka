package com.sample.models;

import java.util.Date;
import java.util.UUID;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "user")
public class User {
	
	@PrimaryKey(value = "id")
	private UUID id;
	
	@Column(value = "name")
	@NotEmpty(message = "Name can't be empty")
	private String name;
	
	@Column(value = "email")
	@NotEmpty(message = "Email can't be empty")
	private String email;
	
	@Column(value = "is_active") 
	private Boolean isActive;
	
	@NotNull
	@Column(value = "created_ts") 
	private Date createdTS = new Date();

	/** constructors **/
	
	public User() {
	}
	
	/** getters & setters **/

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Date getCreatedTS() {
		return createdTS;
	}

	public void setCreatedTS(Date createdTS) {
		this.createdTS = createdTS;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
