package com.sample.models;

import java.util.Date;
import java.util.UUID;

public class User {
	
	private UUID id;
	
	private String name;

	private String email;
	
	private Boolean isActive;
	
	private Date createdTS;

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
