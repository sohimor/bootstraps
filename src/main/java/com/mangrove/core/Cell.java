package com.mangrove.core;

import com.mangrove.interfaces.ICell;


public class Cell implements ICell {
	
}


//only default scoped classes can see other default scoped classes in the same package.
class CellHelper {
	DefaultComplexSugar dcs;
	
	public DefaultComplexSugar getDefaultComplexSugar(){
		return dcs;
	}
}
