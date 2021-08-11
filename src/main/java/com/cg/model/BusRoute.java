package com.cg.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class BusRoute {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int busrouteId;
	
	
	private String routeName;

	private String source;

	
	private String destination;
	
	@OneToMany(cascade = CascadeType.ALL)
	//@JoinColumn(name = "busId")
	private List<Bus> buses=new ArrayList<>();


	public BusRoute(int busrouteId, String routeName, String source, String destination,List<Bus> buses) {
		super();
		this.busrouteId = busrouteId;
		this.routeName = routeName;
		this.source = source;
		this.destination = destination;
		this.buses=buses;

	}

	public BusRoute() {
		super();

	}

	public int getBusrouteId() {
		return busrouteId;
	}

	public void setBusrouteId(int busrouteId) {
		this.busrouteId = busrouteId;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
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
	

	public List<Bus> getBuses() {
		return buses;
	}

	public void setBuses(List<Bus> buses) {
		this.buses = buses;
	}

}
