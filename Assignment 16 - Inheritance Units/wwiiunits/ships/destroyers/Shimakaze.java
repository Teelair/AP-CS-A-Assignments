package wwiiunits.ships.destroyers;

import wwiiunits.ships.Destroyer;

public class Shimakaze extends Destroyer
{
	public Shimakaze()
	{
		super("Japan", 1, null);
	}
	
	@Override
	public String toString()
	{
		return "Unit Name: Shimakaze - Super Destroyer" + "\nBuilt By: " + super.getNation() + "\nAmount Produced: " + super.getAmountMade();
	}
}
