/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author yiyangyang
 */
public class TravelAgency {
	
	private Airliners airliners;
	private CustomerDirectory customerDirectory;
	private MasterScheduel masterScheduel;
	
	public TravelAgency(Airliners airliners, CustomerDirectory cd, MasterScheduel ms) {
		setAirliners(airliners);
		setCustomerDirectory(cd);
		setMasterScheduel(ms);
	}
	

	public static void main(String[] args) {
		
		Airliners airliners = new Airliners();
		CustomerDirectory cd = new CustomerDirectory();
		MasterScheduel ms = new MasterScheduel();

		String dir = System.getProperty("user.dir")+"/src"; // get absolute path of current directory
  
		String airlinersFile = dir + "/Business/Airliners.csv";
		String customersFile = dir + "/Business/CustomerDirectory.csv";
		String fleetFile = dir + "/Business/Fleet.csv";
		String fsFile1 = dir + "/Business/FlightSchedule1.csv";
		String comma = ",";
		String line = "";
		String[] strs;

		try {
			BufferedReader airlinersBr = new BufferedReader(new FileReader(airlinersFile));
			BufferedReader customersBr = new BufferedReader(new FileReader(customersFile));
			BufferedReader fleetBr = new BufferedReader(new FileReader(fleetFile));
			BufferedReader fsBr = new BufferedReader(new FileReader(fsFile1));
			
			while ((line = airlinersBr.readLine()) != null) {
				strs = line.split(comma);
				String airlinerID = strs[0];
				String name = strs[1];
				String year = strs[2];
				Fleet fleet = new Fleet();				
				Airliner airliner = airliners.addAirliner();
				airliner.setId(airlinerID);
				airliner.setNameOfcompany(name);
				airliner.setYear(year);
				airliner.setFleet(fleet);
				fleetBr = new BufferedReader(new FileReader(fleetFile));
				while ((line = fleetBr.readLine()) != null) {
					strs = line.split(comma);
					String airplaneYear = strs[1];
					String airplaneStatus = strs[2];
					String serialNum = strs[3];
					String seatsCount = strs[4];
					String modalNum = strs[5];
					String manufacturer = strs[6];
					String certificate = strs[7];
					String airport = strs[8];
					String airlinerstart= strs[9];
					String airlinerName = strs[10];
					if (airlinerName.toLowerCase().equals(name.toLowerCase())) {
						 Airplane airplane = fleet.addAirplane();
						 airplane.setYear(Integer.valueOf(airplaneYear));
						 airplane.setStatus(airplaneStatus);
						 airplane.setSerialNum(Integer.valueOf(serialNum));
						 airplane.setSeats(Integer.valueOf(seatsCount));
						 airplane.setModelNum(Integer.valueOf(modalNum));
						 airplane.setManufacturer(manufacturer);
						 airplane.setCertificate(certificate);
						 airplane.setAirport(airport);
						 airplane.setAirLinerstart(airlinerstart);
						 airplane.setAirliner(airliner);
					}
				}
			}
			fleetBr.close();
			airlinersBr.close();
			

			MasterScheduel masterScheduel = new MasterScheduel();
			CustomerDirectory customerDirectory = new CustomerDirectory();

			for (int i = 0; i < airliners.getAirliners().size(); i++) {
				
				FlightSchedule flightSchedule = masterScheduel.addFlightS();
				Airliner theairliner = airliners.getAirliners().get(i);
				theairliner.setFlightSchedule(flightSchedule);

				fsBr = new BufferedReader(new FileReader(fsFile1));
				while ((line = fsBr.readLine()) != null) {
					strs = line.split(comma);
					String flightid = strs[0];
					String departure= strs[1];
					String destination = strs[2];
					String airplaneID = strs[3];
					String airlinerIDflight = strs[4];
					
					if (airlinerIDflight.equals(theairliner.getId())) {
						Flight flight = flightSchedule.addFlight();
						flight.setId(flightid);
						flight.setDeparture(departure);
						flight.setDestination(destination);
						flight.setAirliner(theairliner);
						
						if (theairliner.getFleet().getFleet().size() > 0) {
							flight.setAirplane(theairliner.getFleet().getFleet().get(Integer.valueOf(airplaneID)));
						} else {
							flight.setAirplane(new Airplane());
						}
						
						// seats assignment
						Seat[][] seats = new Seat[25][6];
						flight.setSeats(seats);
	
						customersBr = new BufferedReader(new FileReader(customersFile));
						while ((line = customersBr.readLine()) != null) {
							strs = line.split(comma);
							String flightID = strs[4];
	
							if (flightID.equals(flightid)) {
								String cusName = strs[1];
								int cusAge = Integer.valueOf(strs[2]);
								String[] cusSeat = strs[3].split("_");
								int row = Integer.valueOf(cusSeat[0]) - 1;
								int col = Integer.valueOf(cusSeat[1]) - 1;
	
								Customer customer= customerDirectory.addCustomer();
								customer.setAge(cusAge);
								customer.setName(cusName);
								Seat seat = new Seat();
								seat.setCustomer(customer);
								seat.setRow(row);
								seat.setCol(col);
								seat.setPrice(); // set seat price according to the position
								customer.setSeat(seat);
																
								seats[row][col] = seat;
							}
						}
					}
				
				}
			}
			fsBr.close();
			customersBr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		TravelAgency ta = new TravelAgency(airliners, cd, ms);
                int totalOfALLairliner = 0;
                for (Airliner airliner : ta.getAirliners().getAirliners()) {
			// print it
			 totalOfALLairliner += airliner.getFlightSchedule().getSumOfPrice();
                         
		}
		System.out.println("sum of price pf all airliner :\t" + totalOfALLairliner);
                
		for (Airliner airliner : ta.getAirliners().getAirliners()) {
			// print it
			int totalOfpairliner = airliner.getFlightSchedule().getSumOfPrice();
			System.out.println("sum of price per airliner " + airliner.getNameOfcompany() + ":\t" + totalOfpairliner);
		}
                
                for (Airliner airliner : ta.getAirliners().getAirliners()) {
                    
                        for(Flight flight : airliner.getFlightSchedule().getFlightSchedule()){
                            int totalOfpFlight = flight.getSumOfPrice();
                        
                            System.out.println("sum of price per flight using airplane "+ flight.getAirplane().getSerialNum() + " airliner " + airliner.getNameOfcompany() + "\t:" + totalOfpFlight);
                        }
                }
                
                
                
		
	}

	public Airliners getAirliners() {
		return airliners;
	}

	public void setAirliners(Airliners airliners) {
		this.airliners = airliners;
	}

	public CustomerDirectory getCustomerDirectory() {
		return customerDirectory;
	}

	public void setCustomerDirectory(CustomerDirectory customerDirectory) {
		this.customerDirectory = customerDirectory;
	}


	public MasterScheduel getMasterScheduel() {
		return masterScheduel;
	}


	public void setMasterScheduel(MasterScheduel masterScheduel) {
		this.masterScheduel = masterScheduel;
	}


	
}
