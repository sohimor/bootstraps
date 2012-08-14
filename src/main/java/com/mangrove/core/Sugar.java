package com.mangrove.core;

public class Sugar {

	
	

	private PrivateInnerClass privateInnerClass;
	
	public Sugar(){
		System.out.println(this.getClass().getName()+" constructor");
	}

	public PrivateInnerClass getInnerClass() {
		return privateInnerClass;
	}

	public void setInnerClass(PrivateInnerClass innerClass) {
		this.privateInnerClass = innerClass;
	}

	private class PrivateInnerClass	{
		private String name = "private inner class";

		public PrivateInnerClass(){
			System.out.println(this.getClass().getName()+" constructor");
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
	
	public class PublicInnerClass{
		private String hangout = "I'm so wild";
		public PublicInnerClass(){
			System.out.println(this.getClass().getName()+" constructor");
		}
		public String getHangout() {
			return hangout;
		}
		public void setHangout(String hangout) {
			this.hangout = hangout;
		}
		
	}




class DefaultInnerClass{
	private String name= "default inner class";
	
	public DefaultInnerClass(){
		System.out.println(this.getClass().getName()+" constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
protected class ProtectedInnerClass{
	private String name = "protected inner class";

	public ProtectedInnerClass(){
		System.out.println(this.getClass().getName()+" constructor");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
}

 public static class  PublicStaticInnerClass{
	private String name = "Hah i am super static";
	
	public PublicStaticInnerClass(){
		System.out.println(this.getClass().getName()+" constructor");
	}
}

}//end sugar class





//////////////////////////Top level classes /////////////////


//if its a top level class it must be public, default, abstract or final
//if the class is default anything outside of this package can't see it
abstract class DefaultAbstractTopLevelClass{
	public DefaultAbstractTopLevelClass(){
		System.out.println(this.getClass().getName()+" constructor");
	}
	public abstract String thatsNotMyName();
}

class DefaultTopLevelClass{
	public DefaultTopLevelClass(){
		System.out.println(this.getClass().getName()+" constructor");
	}
	public String dtlc;
}
