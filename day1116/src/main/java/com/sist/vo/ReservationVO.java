package com.sist.vo;

import java.util.Date;

public class ReservationVO {
	private String cinemaName;
	private int theater_number;
	private String title;
	private Date day;
	private int seats_number;
	private int price;
	public ReservationVO(String cinemaName, int theater_number, String title, Date day, int seats_number, int price) {
		super();
		this.cinemaName = cinemaName;
		this.theater_number = theater_number;
		this.title = title;
		this.day = day;
		this.seats_number = seats_number;
		this.price = price;
	}
	public ReservationVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCinemaName() {
		return cinemaName;
	}
	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}
	public int getTheater_number() {
		return theater_number;
	}
	public void setTheater_number(int theater_number) {
		this.theater_number = theater_number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public int getSeats_number() {
		return seats_number;
	}
	public void setSeats_number(int seats_number) {
		this.seats_number = seats_number;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
