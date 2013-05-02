package edu.chl.wmax.personalarm.model.entity;

import java.io.Serializable;

public interface IEntity<ID extends Serializable> {

    public ID getId();

    public void setId(ID id);
}
