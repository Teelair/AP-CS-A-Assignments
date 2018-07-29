package wwiiunits.tanks;

public abstract class LightTank extends Tank
{
	public LightTank(String nation, int amountMade, String fullUnitName, String shortUnitName)
	{
		super(nation, "Light", amountMade, fullUnitName, shortUnitName);
	}
}
