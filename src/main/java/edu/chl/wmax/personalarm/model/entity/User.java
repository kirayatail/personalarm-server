package edu.chl.wmax.personalarm.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "PAUser")
public class User implements Serializable, IEntity<String> {

	@Id
	@NotNull
	private Integer id;
	
	private List<User> friends;
	
	public User(){
		this.friends = new ArrayList<User>();
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

}
