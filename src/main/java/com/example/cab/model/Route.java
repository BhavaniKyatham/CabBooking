package com.example.cab.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Route {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int routeid;
	private String source;
	private String destination;
	private String fare;
	public int getRouteid() {
		return routeid;
	}
	public void setRouteid(int routeid) {
		this.routeid = routeid;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getFare() {
		return fare;
	}
	public void setFare(String fare) {
		this.fare = fare;
	}

}