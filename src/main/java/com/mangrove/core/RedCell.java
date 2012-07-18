package com.mangrove.core;

import com.mangrove.interfaces.IMineral;
import com.mangrove.interfaces.ISpawnable;

public class RedCell extends Cell {

	private Mitochondria m;
	
	public RedCell(){
		super();
	}
	public RedCell(Integer energy){
		m.energyLevel = energy;
	}
	public void consume(Object o){
		if(o instanceof IMineral){
			IMineral temp = (IMineral) o;
			m.energyLevel += temp.provideEnergy();
			
		}
	}
	public RedCell split(){
		if(m.energyLevel >= 200){
			m.metabolize(100);
			return new RedCell(100);
		}
		return null;
	}
	
	/*
	 * private class belonging to redCell
	 */
private class Mitochondria implements ISpawnable {
	Integer energyLevel = 100;
	
	public void metabolize(Integer amount){
		energyLevel -= amount;
	}

	public void convertEnergy() {
		// TODO Auto-generated method stub
		
	}

	public void adrenalizeEnergy() {
		// TODO Auto-generated method stub
		
	}

	public void produceMRNAForChildCell() {
		// TODO Auto-generated method stub
		
	}
}
}
