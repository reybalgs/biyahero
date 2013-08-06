package com.baliwanco.biyahero.model;

import java.util.ArrayList;

public class Route {
	/**
	 * The Route class used for defining routes.
	 */
	private String name;
	private String transit_type;
	private double total_distance;
	private ArrayList<Stop> stops;
	
	public String getTransit_type() {
		return transit_type;
	}
	public void setTransit_type(String transit_type) {
		this.transit_type = transit_type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTotal_distance() {
		return total_distance;
	}
	public void setTotal_distance(double total_distance) {
		this.total_distance = total_distance;
	}
	public ArrayList<Stop> getStops() {
		return stops;
	}
	public void setStops(ArrayList<Stop> stops) {
		this.stops = stops;
	}
	
}
