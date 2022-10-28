package com.te.javabasic;

import lombok.Data;

public class Movies {

	private String name;
	private String actor;
	private String actress;
	public Movies(String name, String actor, String actress) {
		super();
		this.name = name;
		this.actor = actor;
		this.actress = actress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getActress() {
		return actress;
	}
	public void setActress(String actress) {
		this.actress = actress;
	}
	
	
	
}
