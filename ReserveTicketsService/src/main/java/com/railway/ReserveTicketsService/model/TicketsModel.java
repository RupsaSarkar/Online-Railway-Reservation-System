package com.railway.ReserveTicketsService.model;

public class TicketsModel {
	
	private String id;
	private String pnr;
	private String source_station;
	private String destination_station;
	private String departure_date;
	private String boarding_time;
	private String travel_class;
	private String journey_duration;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getSource_station() {
		return source_station;
	}
	public void setSource_station(String source_station) {
		this.source_station = source_station;
	}
	public String getDestination_station() {
		return destination_station;
	}
	public void setDestination_station(String destination_station) {
		this.destination_station = destination_station;
	}
	public String getDeparture_date() {
		return departure_date;
	}
	public void setDeparture_date(String departure_date) {
		this.departure_date = departure_date;
	}
	public String getBoarding_time() {
		return boarding_time;
	}
	public void setBoarding_time(String boarding_time) {
		this.boarding_time = boarding_time;
	}
	public String getTravel_class() {
		return travel_class;
	}
	public void setTravel_class(String travel_class) {
		this.travel_class = travel_class;
	}
	public String getJourney_duration() {
		return journey_duration;
	}
	public void setJourney_duration(String journey_duration) {
		this.journey_duration = journey_duration;
	}
	
	public TicketsModel() {
		
	}
	public TicketsModel(String id, String pnr, String source_station, String destination_station, String departure_date,
			String boarding_time, String travel_class, String journey_duration) {
		super();
		this.id = id;
		this.pnr = pnr;
		this.source_station = source_station;
		this.destination_station = destination_station;
		this.departure_date = departure_date;
		this.boarding_time = boarding_time;
		this.travel_class = travel_class;
		this.journey_duration = journey_duration;
	}
	public TicketsModel(String pnr, String source_station, String destination_station, String departure_date,
			String boarding_time, String travel_class, String journey_duration) {
		this.pnr = pnr;
		this.source_station = source_station;
		this.destination_station = destination_station;
		this.departure_date = departure_date;
		this.boarding_time = boarding_time;
		this.travel_class = travel_class;
		this.journey_duration = journey_duration;
	}
	@Override
	public String toString() {
		return "TicketsModel [id=" + id + ", pnr=" + pnr + ", source_station=" + source_station
				+ ", destination_station=" + destination_station + ", departure_date=" + departure_date
				+ ", boarding_time=" + boarding_time + ", travel_class=" + travel_class + ", journey_duration="
				+ journey_duration + "]";
	}
	
	
	
	
	
	
	

}
