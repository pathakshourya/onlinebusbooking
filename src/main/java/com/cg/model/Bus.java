package com.cg.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
public class Bus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int busId;

	
	@Size (min = 2, message = "busnumber should not be null")
	private String busNumber;

	@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "busrouteId")
	private BusRoute busRoute;
	@Min(value=2,message="Minium value should be Two")
	private int totalSeats;

	@NotNull(message = "fare should not be null")
	private int fare;
	
	
	@NotNull(message="jouurneyStartTime should not be null")
	private LocalTime journeyStartTime;
	
	@NotNull(message="jouurneyEndTime should not be null")
	private LocalTime journeyEndTime;
	
	//@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name="busopeartorId")
	//private BusOperator busoperator;


	public Bus(int busId, String busNumber, BusRoute busRoute, int totalSeats, int fare, 
			LocalTime journeyStartTime, LocalTime journeyEndTime) {
		super();
		this.busId = busId;
		this.busNumber = busNumber;
		this.busRoute = busRoute;
		this.totalSeats = totalSeats;
		this.fare = fare;
		
		this.journeyStartTime = journeyStartTime;
		this.journeyEndTime = journeyEndTime;
	}


	
	public Bus() {
		super();

	}

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public BusRoute getBusRoute() {
		return busRoute;
	}

	public void setBusRoute(BusRoute busRoute) {
		this.busRoute = busRoute;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}
	


	public LocalTime getJourneyStartTime() {
		return journeyStartTime;
	}



	public void setJourneyStartTime(LocalTime journeyStartTime) {
		this.journeyStartTime = journeyStartTime;
	}



	public LocalTime getJourneyEndTime() {
		return journeyEndTime;
	}



	public void setJourneyEndTime(LocalTime journeyEndTime) {
		this.journeyEndTime = journeyEndTime;
	}

}
