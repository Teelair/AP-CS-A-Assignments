package wwiiunits.planes;

public abstract class Bomber extends Plane
{
	public Bomber(String nation, int amountMade, String fullUnitName, String shortUnitName)
	{
		super(nation, "Bomber", amountMade, fullUnitName, shortUnitName);
	}
}
