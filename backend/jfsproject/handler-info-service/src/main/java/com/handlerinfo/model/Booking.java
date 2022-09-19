package com.handlerinfo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Booking {
	@Id
	@Field
	private String id;
	@Field
	private String train_name;
	@Field
	private String train_no;
	@Field
	private String fname;
	@Field
	private String lname;
	@Field
	private int age;
	@Field
	private String start_from;
	@Field
	private String destination;
	
	public Booking() {
		super();
	}

	public Booking(String id, String train_name, String train_no, String fname, String lname, int age, String start_from,
			String destination) {
		super();
		this.id = id;
		this.train_name = train_name;
		this.train_no = train_no;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.start_from = start_from;
		this.destination = destination;
	}

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTrain_name() {
		return train_name;
	}

	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}

	public String getTrain_no() {
		return train_no;
	}

	public void setTrain_no(String train_no) {
		this.train_no = train_no;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStart_from() {
		return start_from;
	}

	public void setStart_from(String start_from) {
		this.start_from = start_from;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", train_name=" + train_name + ", train_no=" + train_no + ", fname=" + fname
				+ ", lname=" + lname + ", age=" + age + ", start_from=" + start_from + ", destination=" + destination
				+ "]";
	}
	
	
	
}