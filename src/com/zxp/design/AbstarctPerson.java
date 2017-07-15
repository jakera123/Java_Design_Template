package com.zxp.design;

public abstract class AbstarctPerson {
	
	public void prepareGotoSchool(){
		dressUp();
		eatBreakfast();
		takeThings();
	}
	
	protected abstract void dressUp();
	protected abstract void eatBreakfast();
	protected abstract void takeThings();
	
	

}
