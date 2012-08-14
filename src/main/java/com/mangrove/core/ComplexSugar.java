package com.mangrove.core;

//both classes are in same package, must implement 'thatsNotMyName' because it is the first concrete class
public class ComplexSugar extends DefaultAbstractTopLevelClass {

	public ComplexSugar(){
		System.out.println(this.getClass().getName()+" constructor");
	}
	@Override
	public String thatsNotMyName() {
		// TODO Auto-generated method stub
		return this.getClass().getName() + ":thatsNotMyName()";
	}

}

//both classes are in the same package so scope is fine.
class DefaultComplexSugar extends DefaultTopLevelClass{
	
	//default scoped class with a public constuctor is okay, but this should be effectively Default
	public DefaultComplexSugar(){
		super();
		System.out.println(this.dtlc);
	}
}
