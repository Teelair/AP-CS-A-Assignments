package wwiiunits.ships;

import wwiiunits.main.Unit;

public abstract class Ship extends Unit
{
	public Ship(String nation, String unitSubtype, int amountMade, String shipClass)
	{
		super(nation, "Ship", unitSubtype, amountMade, shipClass, null);
	}
	
	@Override
	public String toString()
	{
		return "Unit Name: " + super.getFullUnitName() + "-class " + super.getUnitSubtype() + "\nBuilt by: " + getNation() + "\nAmount Produced: " + super.getAmountMade();
	}
}
