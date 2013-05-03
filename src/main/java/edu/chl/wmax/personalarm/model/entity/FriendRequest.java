package edu.chl.wmax.personalarm.model.entity;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import edu.chl.wmax.personalarm.model.entity.User;

public class FriendRequest implements Serializable, IEntity<Long> {
	
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
	}
	
	@Override
	public Long getId() {
		return Id;
	}

	@Override
	public void setId(Long id) {
		this.Id = id;
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
