package com.example.cab.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cab {
	@Id
	@GeneratedValue
	private int cabid;
	private int routeid;
	private String cabnumber;
	private String cabtype;
	private String seater;
	private String status;
	
	public int getCabid() {
		return cabid;
	}
	public void setCabid(int cabid) {
		this.cabid = cabid;
	}
	public int getRouteid() {
		return routeid;
	}
	public void setRouteid(int routeid) {
		this.routeid = routeid;
	}
	
	public String getCabnumber() {
		return cabnumber;
	}
	public void setCabnumber(String cabnumber) {
		this.cabnumber = cabnumber;
	}
	public String getCabtype() {
		return cabtype;
	}
	public void setCabtype(String cabtype) {
		this.cabtype = cabtype;
	}
	public String getSeater() {
		return seater;
	}
	public void setSeater(String seater) {
		this.seater = seater;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


}
