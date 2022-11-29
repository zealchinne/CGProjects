package com.jojuskills;

public class Theatre {
	// declaring instance variables
	  private String movieName;
	  private String movieTime;
	  private double ticketPrice;
	public Theatre() {
		super();
	}
	public Theatre(String movieName, String movieTime, double ticketPrice) {
		super();
		this.movieName = movieName;
		this.movieTime = movieTime;
		this.ticketPrice = ticketPrice;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieTime() {
		return movieTime;
	}
	public void setMovieTime(String movieTime) {
		this.movieTime = movieTime;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	  //method to display movie
	  void displayMovie()
	  {
	    System.out.println("Movie Name:   "+ getMovieName()+"    "+ "Time:  "+ getMovieTime()+ "   "+"Ticket Price:  "+getTicketPrice());
	  }
	  
	}	// end class 
