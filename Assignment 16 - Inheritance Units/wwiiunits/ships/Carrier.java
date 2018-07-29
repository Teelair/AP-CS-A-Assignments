package wwiiunits.ships;

public abstract class Carrier extends Ship
{	
	public Carrier(String nation, int amountMade, String fullUnitName)
	{
		super(nation, "Carrier", amountMade, fullUnitName);
	}
}
