package wwiiunits.planes.fighters;

import wwiiunits.planes.Fighter;

public class Yakovlev extends Fighter
{
	public Yakovlev()
	{
		super("USSR", 16769, "Yakovlev Yak-9", null);
	}
	
	@Override
	public String toString()
	{
		return "Unit Name: " + super.getFullUnitName() + " - " + super.getUnitSubtype() + " " + super.getUnitType() + "\nBuilt By: " + super.getNation() + "\nAmount Produced: " + super.getAmountMade();
	}
}
