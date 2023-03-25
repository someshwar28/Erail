package com.example.demo.entity;

public class Person {
	
	private String name;
	private String from;
	private String to;
	private String doj;
	private String gende;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getGende() {
		return gende;
	}
	public void setGende(String gende) {
		this.gende = gende;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", from=" + from + ", to=" + to + ", doj=" + doj + ", gende=" + gende + "]";
	}
	
	

}
