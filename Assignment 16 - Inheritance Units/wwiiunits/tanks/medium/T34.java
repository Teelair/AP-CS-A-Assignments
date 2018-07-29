package wwiiunits.tanks.medium;

import wwiiunits.tanks.MediumTank;

public class T34 extends MediumTank
{
	public T34()
	{
		super("USSR", 35119, "T-34", null);
	}
	
	@Override
	public String toString()
	{
		return "Unit Name: " + super.getFullUnitName() + " - " + super.getUnitSubtype() + " " + super.getUnitType() + "\nBuilt By: " + super.getNation() + "\nAmount Produced: " + super.getAmountMade();
	}
}
