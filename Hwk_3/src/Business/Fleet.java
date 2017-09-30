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
public class Fleet {
	
	private int id;
	private ArrayList<Airplane> fleet;

	public Fleet() {
		this.fleet = new ArrayList<Airplane>();
	}

	public ArrayList<Airplane> getFleet() {
		return fleet;
	}

	public void setFleet(ArrayList<Airplane> fleet) {
		this.fleet = fleet;
	}

	public Airplane addAirplane() {
		Airplane vs = new Airplane();
		fleet.add(vs);
		return vs;
	}

	public void deleteAirplane(Airplane v) {
		fleet.remove(v);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
