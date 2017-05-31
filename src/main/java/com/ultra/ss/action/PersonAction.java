package com.ultra.ss.action;

public class PersonAction {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String execute() {
		System.out.println("hello : " + name);
		return "success";
	}
}
