package wwiiunits.tanks;

public abstract class MediumTank extends Tank
{
	public MediumTank(String nation, int amountMade, String fullUnitName, String shortUnitName)
	{
		super(nation, "Medium", amountMade, fullUnitName, shortUnitName);
	}
}
