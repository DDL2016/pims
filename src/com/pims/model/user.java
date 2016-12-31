package com.pims.model;

public class user {
	private String username;
	private String password1;
	private String password2;
	private String name;
	private String sex;
	private String birth;
	private String nation;
	private String edu;
	private String works;
	private String phone;
	private String place;
	private String emall;
	
	public user() {
		super();
	}
	public user(String username, String password1, String password2, String name, String sex, String birth,
			String nation, String edu, String works, String phone, String place,String emall) {
		super();
		this.username = username;
		this.password1 = password1;
		this.password2 = password2;
		this.name = name;
		this.sex = sex;
		this.birth = birth;
		this.nation = nation;
		this.edu = edu;
		this.works = works;
		this.phone = phone;
		this.place = place;
		this.emall = emall;
	}
	public String getEmall() {
		return emall;
	}
	public void setEmall(String emall) {
		this.emall = emall;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getEdu() {
		return edu;
	}
	public void setEdu(String edu) {
		this.edu = edu;
	}
	public String getWork() {
		return works;
	}
	public void setWork(String works) {
		this.works = works;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	

}
