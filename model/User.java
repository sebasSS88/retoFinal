package model;

import java.io.Serializable;

public class User implements Serializable {
//Atributtes
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String likes;
	private String adress;
	private String name;
	private String surname;
	private int tlf;
	private String email;
	private int account_n;

//Getters & Setters

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

	public String getLikes() {
		return likes;
	}

	public void setLikes(String likes) {
		this.likes = likes;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getTlf() {
		return tlf;
	}

	public void setTlf(int tlf) {
		this.tlf = tlf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAccount_n() {
		return account_n;
	}

	public void setAccount_n(int account_n) {
		this.account_n = account_n;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", likes=" + likes + ", adress=" + adress
				+ ", name=" + name + ", surname=" + surname + ", tlf=" + tlf + ", email=" + email + ", account_n="
				+ account_n + "]";
	}

}