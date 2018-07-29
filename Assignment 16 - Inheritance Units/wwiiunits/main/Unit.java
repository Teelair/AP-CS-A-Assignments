package wwiiunits.main;

public abstract class Unit
{
	private String nation;
	private String unitType;
	private String unitSubtype;
	private int amountMade;
	private String fullUnitName;
	private String shortUnitName;
	
	public Unit(String nation, String unitType, String unitSubtype, int amountMade, String fullUnitName, String shortUnitName)
	{
		this.nation = nation;
		this.unitType = unitType;
		this.unitSubtype = unitSubtype;
		this.amountMade = amountMade;
		this.fullUnitName = fullUnitName;
		this.shortUnitName = shortUnitName;
	}
	
	public String getNation()
	{
		return nation;
	}
	
	public String getUnitType()
	{
		return unitType;
	}
	
	public String getUnitSubtype()
	{
		return unitSubtype;
	}
	
	public int getAmountMade()
	{
		return amountMade;
	}
	
	public String getFullUnitName()
	{
		return fullUnitName;
	}
	
	public String getShortUnitName()
	{
		return shortUnitName;
	}
	
	public String toString()
	{
		return "Unit Name: " + fullUnitName + " (" + shortUnitName + ") - " + unitSubtype + " " + unitType + "\nBuilt by: " + getNation() + "\nAmount Produced: " + amountMade;
	}
}
