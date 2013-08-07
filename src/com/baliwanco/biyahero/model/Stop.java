package com.baliwanco.biyahero.model;

import android.location.Location;

public class Stop {
	/**
	 * Class definition for a Stop. A Stop is somewhere where passengers can
	 * alight and maybe board public transit. It can always be upgraded as a
	 * terminal.
	 */
	private String name;
	private String description;
	private String transit_type;
	private Location location;
	
	public Stop(String name, String description, String transit_type) {
		super();
		this.name = name;
		this.description = description;
		this.transit_type = transit_type;
	}

	public Stop(String name, String description, String transit_type,
			Location location) {
		super();
		this.name = name;
		this.description = description;
		this.transit_type = transit_type;
		this.location = location;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTransit_type() {
		return transit_type;
	}
	public void setTransit_type(String transit_type) {
		this.transit_type = transit_type;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
}
