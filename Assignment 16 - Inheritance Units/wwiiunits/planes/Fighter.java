package wwiiunits.planes;

public abstract class Fighter extends Plane
{
	public Fighter(String nation, int amountMade, String fullUnitName, String shortUnitName)
	{
		super(nation, "Fighter", amountMade, fullUnitName, shortUnitName);
	}
}
