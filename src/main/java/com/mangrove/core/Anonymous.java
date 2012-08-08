package com.mangrove.core;

public class Anonymous {

	
	private InnerClass innerClass;

	public InnerClass getInnerClass() {
		return innerClass;
	}

	public void setInnerClass(InnerClass innerClass) {
		this.innerClass = innerClass;
	}

	private class InnerClass	{
		private String name = "private inner class";

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
	
}

class DefaultInnerClass{
	private String name= "default inner class";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
protected class ProtectedInnerClass{
	private String name = "protected inner class";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}


}//end main class

//if its a top level class it must be public, default,, abstract or final
abstract class ProtectedAbstractTopLevelClass{
	
	public abstract String thatsNotMyName();
}