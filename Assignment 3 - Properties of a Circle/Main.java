public class Main 
{
	//public static final double pi = Math.pi;
	public static final double pi = 3.141;
	
	public static void main(String[] args)
	{
		printNicely();
	}
	
	public static void printNicely()
	{
		System.out.println("Radius: " + getRadius());
		System.out.println("Diameter: " + calculateDiameter(getRadius()));
		System.out.println("Circumference: " + calculateCircumference(getRadius()));
		System.out.println("Area: " + calculateArea(getRadius()));
		System.out.println("Volume: " + calculateVolume(getRadius()));
	}
	
	public static int getRadius()
	{
		return 17;
	}
	
	public static int calculateDiameter(int radius)
	{
		int diameter = radius * 2;
		return diameter;
	}
	
	public static double calculateCircumference(int radius)
	{
		double circumference = calculateDiameter(radius) * pi;
		return circumference;
	}
	
	public static double calculateArea(int radius)
	{
		//double area = Math.pow(radius, 2) * pi;
		double area = (radius * radius) * pi;
		return area;
	}
	
	public static double calculateVolume(int radius)
	{
		double volume = ((double) 4/3) * (radius * radius * radius) * pi;
		return volume;
	}
}
