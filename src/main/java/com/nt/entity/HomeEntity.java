package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HomeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	public HomeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String name;
	private String email;
	private String password;
	private String roal;
	private String Address;
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
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
	public String getRoal() {
		return roal;
	}
	public void setRoal(String roal) {
		this.roal = roal;
	}
	public HomeEntity(int id, String name, String email, String password, String roal) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.roal = roal;
}
}