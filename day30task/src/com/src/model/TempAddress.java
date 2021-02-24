package com.src.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="tempadd")
public class TempAddress extends Customer {
private String tempAdd;


public void setTempAdd(String tempAdd) {
	this.tempAdd = tempAdd;
}


public String getTempAdd() {
	return tempAdd;
}



}

