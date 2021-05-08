package com.example.demo.bean;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
//import javax.persistence.Table;

@Entity
//@Table(name = "user_details")
public class User {
	
	@Id
	private Long id;
	@NotEmpty(message = "The Username field can not be Empty!")
	@Size(min=8,max=50, message="The Username Should beminimum of 8 Characters")
	private String username;
	@NotBlank(message="The Password field cannot be Empty")
	private String password;
	@NotEmpty(message="The address field cannot be Empty")
	private String address;
	private Long phone;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	
	

}
