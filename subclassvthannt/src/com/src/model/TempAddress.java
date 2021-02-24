package com.src.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="cadd")
@PrimaryKeyJoinColumn(name="id")
public class TempAddress extends Customer {
private String tempAdd;


public void setTempAdd(String tempAdd) {
	this.tempAdd = tempAdd;
}


public String getTempAdd() {
	return tempAdd;
}



}

