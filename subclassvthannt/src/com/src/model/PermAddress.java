package com.src.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="padd")
@PrimaryKeyJoinColumn(name="id")
public class PermAddress extends Customer{
private String address;

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

}
