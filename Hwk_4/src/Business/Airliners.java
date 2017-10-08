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
public class Airliners {
	
	private ArrayList<Airliner> airliners;
	

	public Airliners() {
		airliners = new ArrayList<Airliner>();

	}

	public Airliner addAirliner() {
		Airliner vs = new Airliner();
		airliners.add(vs);
		return vs;
	}

	public void deleteAirliner(Airliner v) {
		airliners.remove(v);
	}

	public ArrayList<Airliner> getAirliners() {
		return this.airliners;
	}
	
}
