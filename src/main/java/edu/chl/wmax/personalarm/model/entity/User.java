package edu.chl.wmax.personalarm.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "PAUser")
public class User implements Serializable, IEntity<Integer> {

	@Id
	@NotNull
	private Integer id;
	
	private List<User> friends;
	
	private String name;
	private String email;
	private String password;
	
	public User(){
		this.friends = new ArrayList<User>();
	}
	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
