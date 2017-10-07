/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author yiyangyang
 */
public class FlightSchedule {
	
	private int sumOfPrice;
	private ArrayList<Flight> flightSchedule;

	public FlightSchedule() {
		flightSchedule = new ArrayList<Flight>();
	}

	public ArrayList<Flight> getFlightSchedule() {
		return flightSchedule;
	}

	public void setFlightSchedule(ArrayList<Flight> flightSchedule) {
		this.flightSchedule = flightSchedule;
	}

	public Flight addFlight() {
		Flight vs = new Flight();
		flightSchedule.add(vs);
		return vs;
	}

	public void deleteFlight(Flight v) {
		flightSchedule.remove(v);
	}

	public int getSumOfPrice() {
		sumOfPrice = 0;
		for (Flight flight : getFlightSchedule()) {
			sumOfPrice += flight.getSumOfPrice();
		}
		return sumOfPrice;
	}

	public void setSumOfPrice(int sumOfPrice) {
		this.sumOfPrice = sumOfPrice;
	}
}
