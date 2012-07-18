package com.mangrove.core;

import com.mangrove.interfaces.IMineral;

public class Protein implements IMineral {
	
	private Integer energy = 10;
	
	public Protein(){
		
	}

	public Integer getEnergy() {
		return energy;
	}

	public void setEnergy(Integer energy) {
		this.energy = energy;
	}

	public Integer provideEnergy() {
		Integer temp = energy;
		energy = null;
		return temp;
	}

}
