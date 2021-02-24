package com.src.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="peradd")
public class PermAddress extends Customer{
private String address;

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

}
