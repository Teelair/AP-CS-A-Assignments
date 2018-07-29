package wwiiunits.planes;

import wwiiunits.main.Unit;

public abstract class Plane extends Unit
{	
	public Plane(String nation, String unitSubtype, int amountMade, String fullUnitName, String shortUnitName)
	{
		super(nation, "Plane", unitSubtype, amountMade, fullUnitName, shortUnitName);
	}
}
