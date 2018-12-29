package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="passportnumber")
	private String passportnumber;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassportnumber() {
		return passportnumber;
	}
	public void setPassportnumber(String passportnumber) {
		this.passportnumber = passportnumber;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", passportnumber=" + passportnumber + "]";
	}
}
