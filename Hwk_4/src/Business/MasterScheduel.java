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
public class MasterScheduel {
	
	ArrayList<FlightSchedule> masterScheduel;

	public MasterScheduel() {
		masterScheduel = new ArrayList<FlightSchedule>();
	}

	public ArrayList<FlightSchedule> getMasterScheduel() {
		return masterScheduel;
	}

	public void setMasterScheduel(ArrayList<FlightSchedule> masterScheduel) {
		this.masterScheduel = masterScheduel;
	}

	public FlightSchedule addFlightS() {
		FlightSchedule vs = new FlightSchedule();
		masterScheduel.add(vs);
		return vs;
	}

	public void deleteFlightS(FlightSchedule v) {
		masterScheduel.remove(v);
	}

}
