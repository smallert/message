package org.model;

public class Login {
	private String id;
	private String name;
	private String password;
	public String getId(){
		return this.id;
	}
	public void setId(String string){
		this.id=string;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.name=password;
	}
}
