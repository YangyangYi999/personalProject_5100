/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author yiyangyang
 */
public class Flight {

	private String id;
	private Airplane airplane;
	private String destination;
	private String departure;
	private Airliner airliner;
	private Seat[][] seats;
	private int sumOfPrice;

	public Airliner getAirliner() {
		return airliner;
	}

	public void setAirliner(Airliner airliner) {
		this.airliner = airliner;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public Airplane getAirplane() {
		return airplane;
	}

	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

	public int getSumOfPrice() {
		sumOfPrice = 0;
		for (int row = 0; row < 25; row++) {
			for (int col = 0; col < 6; col++) {
				Seat seat = this.seats[row][col];
				if (seat != null && seat.getCustomer() != null) {
					sumOfPrice += seat.getPrice();
				}
			}
		}
		return sumOfPrice;
	}

	public Seat[][] getSeats() {
		return seats;
	}

	public void setSeats(Seat[][] seats) {
		this.seats = seats;
	}

	public void setSeats(int row, int column) {
		this.seats = new Seat[row][column];
	}

	public Seat addSeat(Customer cus) {
		for (int row = 0; row < 25; row++) {
			for (int col = 0; col < 6; col++) {
				Seat st = this.seats[row][col];
				if (st.getCustomer() == null) {
					st.setCustomer(cus);
					return st;
				}
			}
		}
		return new Seat();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
