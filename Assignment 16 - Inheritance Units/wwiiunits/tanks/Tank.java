package wwiiunits.tanks;

import wwiiunits.main.Unit;

public abstract class Tank extends Unit
{
	public Tank(String nation, String unitSubtype, int amountMade, String fullUnitName, String shortUnitName)
	{
		super(nation, "Tank", unitSubtype, amountMade, fullUnitName, shortUnitName);
	}
}
