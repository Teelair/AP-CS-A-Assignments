public class Main 
{
	public static void main(String[] args)
	{
		printNicely();
	}

	public static void printNicely()
	{
		System.out.println("Days: " + getDays());
		System.out.println("Hours: " + getHours(getDays()));
		System.out.println("Minutes: " + getMinutes(getHours(getDays())));
		System.out.println("Kiloseconds: " + getKiloseconds(getSeconds(getMinutes(getHours(getDays())))));
		System.out.println("Seconds: " + getSeconds(getMinutes(getHours(getDays()))));
		System.out.println("Milliseconds: " + getMilliseconds(getSeconds(getMinutes(getHours(getDays())))));
		System.out.println("Microseconds: " + getMicroseconds(getMilliseconds(getSeconds(getMinutes(getHours(getDays()))))));
	}
	
	public static int getDays()
	{
		int days = 7;
		return days;
	}

	public static int getHours(int days)
	{
		int hours = days * 24;
		return hours;
	}

	public static int getMinutes(int hours)
	{
		int minutes = hours * 60;
		return minutes;
	}
	
	public static int getSeconds(int minutes)
	{
		int seconds = minutes * 60;
		return seconds;
	}

	public static int getKiloseconds(int seconds)
	{
		int kiloseconds = seconds / 1000;
		return kiloseconds;
	}

	public static int getMilliseconds(int seconds)
	{
		int milliseconds = seconds * 1000;
		return milliseconds;
	}
	/**
	 * 
	 * W/ SCIENTIFIC NOTATION
	 *  public static double getMicroseconds(double milliseconds)
	 *  {
	 *       double microseconds = milliseconds * 1000;
	 *	    return microseconds;
	 *  }
	 */

	/**
	 * Extra Credit Method- Using long
	 */	 
	public static long getMicroseconds(long milliseconds)
	{
		long microseconds = milliseconds * 1000;
		return microseconds;
	}
}
