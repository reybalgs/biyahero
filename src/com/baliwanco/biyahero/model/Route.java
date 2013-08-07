package com.baliwanco.biyahero.model;

import java.util.ArrayList;

public class Route {
	/**
	 * The Route class used for defining routes.
	 */
	private String name;
	private double total_distance;
	private ArrayList<Stop> stops;
	
	public int getNumStops() {
		return stops.size();
	}
	
	public Route(String name, double total_distance, ArrayList<Stop> stops) {
		super();
		this.name = name;
		this.total_distance = total_distance;
		this.stops = stops;
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
