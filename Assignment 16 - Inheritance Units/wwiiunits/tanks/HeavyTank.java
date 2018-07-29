package wwiiunits.tanks;

public abstract class HeavyTank extends Tank
{
	public HeavyTank(String nation, int amountMade, String fullUnitName, String shortUnitName)
	{
		super(nation, "Heavy", amountMade, fullUnitName, shortUnitName);
	}
}
