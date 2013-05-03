package edu.chl.wmax.personalarm.model.entity;

import java.io.Serializable;
import edu.chl.wmax.personalarm.model.entity.User;

public class FriendRequest implements Serializable, IEntity<Integer> {

	//@Id
	//@NotNull
	private Integer id;
	
	private User sender;
	private User receiver;
	
	// May be unnecessary.
	public FriendRequest(User sender, User receiver) {
		this.setSender(sender);
		this.setReceiver(receiver);
	}
	
	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
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
