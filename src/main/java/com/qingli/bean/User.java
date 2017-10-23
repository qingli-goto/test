package com.qingli.bean;

public class User {
	private int id;
	private int versioon;
	private String username;
	private String password;
	private String birthday;
	private int sex;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVersioon() {
		return versioon;
	}

	public void setVersioon(int versioon) {
		this.versioon = versioon;
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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public User(int id, int versioon, String username, String password, String birthday, int sex) {
		super();
		this.id = id;
		this.versioon = versioon;
		this.username = username;
		this.password = password;
		this.birthday = birthday;
		this.sex = sex;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", versioon=" + versioon + ", username=" + username + ", password=" + password
				+ ", birthday=" + birthday + ", sex=" + sex + "]";
	}

}
