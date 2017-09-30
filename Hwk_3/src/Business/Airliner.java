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
public class Airliner {
	
	private String id;
	private String nameOfcompany;
	private String Year;
	private Fleet fleet;
	private FlightSchedule flightSchedule;


	public Airliner() {
		
	}

	public FlightSchedule getFlightSchedule() {
		return flightSchedule;
	}

	public void setFlightSchedule(FlightSchedule flightSchedule) {
		this.flightSchedule = flightSchedule;
	}

	public String getNameOfcompany() {
		return nameOfcompany;
	}

	public void setNameOfcompany(String nameOfcompany) {
		this.nameOfcompany = nameOfcompany;
	}

	public String getYear() {
		return Year;
	}

	public void setYear(String Year) {
		this.Year = Year;
	}

	public Fleet getFleet() {
		return fleet;
	}

	public void setFleet(Fleet fleet) {
		this.fleet = fleet;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
