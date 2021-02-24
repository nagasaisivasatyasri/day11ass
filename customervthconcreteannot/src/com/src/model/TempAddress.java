package com.src.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="caddress2")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="name",column=@Column(name="name")),
	
})
public class TempAddress extends Customer {
private String tempAdd;


public void setTempAdd(String tempAdd) {
	this.tempAdd = tempAdd;
}


public String getTempAdd() {
	return tempAdd;
}



}

