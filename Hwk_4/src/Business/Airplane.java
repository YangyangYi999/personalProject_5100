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
public class Airplane {

	private int year;
	private String status;
	private int serialNum;
	private int seats;
	private int modelNum;
	private String manufacturer;
	private String certificate;
	private String airport;
	private String airLinerstart;
	private Airliner airliner;

	public Airplane() {

	}


	public String getAirLinerstart() {
		return airLinerstart;
	}

	public void setAirLinerstart(String airLinerstart) {
		this.airLinerstart = airLinerstart;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getModelNum() {
		return modelNum;
	}

	public void setModelNum(int modelNum) {
		this.modelNum = modelNum;
	}

	public int getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getAirport() {
		return airport;
	}

	public void setAirport(String airport) {
		this.airport = airport;
	}

        @Override
	public String toString() {
		return String.valueOf(serialNum);
	}


	public Airliner getAirliner() {
		return airliner;
	}


	public void setAirliner(Airliner airliner) {
		this.airliner = airliner;
	}
        
    

}
