package com.sample.models;

import java.util.Date;
import java.util.UUID;

import javax.validation.constraints.NotNull;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "notification")
public class Notification {
	
	@PrimaryKey(value = "id")
	private UUID id;
	
	@Column(value = "from_user")
	private String from;
	
	@Column(value = "to_user")
	private String to;
	
	@Column(value = "message")
	private String message;
	
	@NotNull
	@Column(value = "created_ts") 
	private Date createdTS = new Date();

	/** constructors **/
	
	public Notification() {
	}
	
	public Notification(UUID id, String from, String to, String message) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.message = message;
	}

	/** getters & setters **/
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreatedTS() {
		return createdTS;
	}

	public void setCreatedTS(Date createdTS) {
		this.createdTS = createdTS;
	}
	
}
