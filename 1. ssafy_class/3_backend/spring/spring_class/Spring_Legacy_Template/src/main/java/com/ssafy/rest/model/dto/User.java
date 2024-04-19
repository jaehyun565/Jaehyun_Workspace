package com.ssafy.rest.model.dto;


public class User {
	private String id;
	private String password;
	private String name;
	private int curriculumCode;
	private String curriculumName;
	
	
	public User() {
		
	}
	
	public User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}




	public User(String id, String password, String name, int curriculumCode) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.curriculumCode = curriculumCode;
	}

	
	public String getCurriculumName() {
		return curriculumName;
	}
	public void setCurriculumName(String curriculumName) {
		this.curriculumName = curriculumName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCurriculumCode() {
		return curriculumCode;
	}
	public void setCurriculumCode(int curriculumCode) {
		this.curriculumCode = curriculumCode;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", name=" + name + ", curriculumCode=" + curriculumCode
				+ ", curriculumName=" + curriculumName + "]";
	}
	
	
}
