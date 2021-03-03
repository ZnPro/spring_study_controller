package com.cos.mycontroller;

public class User {
	
	//1.username=ssar&password=1234 >>필드 있는지 확인
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		System.out.println("setUsername() 실행됨");
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	
	//2. setter 호출
	public void setPassword(String password) {
		System.out.println("setPassword() 실행됨");
		this.password = password;
	}
	
	//이 녀석은 자바 오브젝트
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
	
	
	

}
