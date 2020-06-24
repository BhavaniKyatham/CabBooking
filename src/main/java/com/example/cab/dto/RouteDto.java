package com.example.cab.dto;

public class RouteDto {
	private int routeid;
	private String source;
	private String destination;
	private double fare;
	
	
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
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	
	
}
