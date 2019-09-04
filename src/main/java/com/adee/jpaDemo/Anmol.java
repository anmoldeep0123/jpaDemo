package com.adee.jpaDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Anmol {

	@Id
	private int id;
	private String fname;
	private String lname;

	public Anmol() {

	}

	public Anmol(int id, String fname, String lname) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Anmol [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}
}
