package com.example.demo.entity;

public class Ticket {
	
	private Integer ticketNo;
	private String name;
	private String from;
	private String to;
	private String status;
	private double amount;
	public Integer getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(Integer ticketNo) {
		this.ticketNo = ticketNo;
	}
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Ticket [ticketNo=" + ticketNo + ", name=" + name + ", from=" + from + ", to=" + to + ", status="
				+ status + ", amount=" + amount + "]";
	}
	
	

}
