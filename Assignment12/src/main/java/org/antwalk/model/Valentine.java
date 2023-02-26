package org.antwalk.model;

public class Valentine {
	
	private int id;
	private String day;
	private String gift;
	private String location;
	
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getGift() {
		return gift;
	}
	public void setGift(String gift) {
		this.gift = gift;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Valentine {day=" + day + ", gift=" + gift + ", location=" + location + ", id=" + id + "}";
	}
	public Valentine(String day, String gift, String location, int id) {
		super();
		this.day = day;
		this.gift = gift;
		this.location = location;
		this.id = id;
	}
	public Valentine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
