package edu.chl.wmax.personalarm.model.entity;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import edu.chl.wmax.personalarm.model.entity.User;

public class FriendRequest implements Serializable, IEntity<String> {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	private User sender;
	private User receiver;
	
	// May be unnecessary.
	public FriendRequest(User sender, User receiver) {
		this.setSender(sender);
		this.setReceiver(receiver);
		// Set id?
	}
	
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

}
