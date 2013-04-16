package edu.chl.wmax.personalarm.server.model.entity;

import java.io.Serializable;

public interface IEntity<ID extends Serializable> {
	public ID getID();
	
	public void setID(ID id);
}
