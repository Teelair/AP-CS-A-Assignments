import java.util.ArrayList;
import java.util.List;

public class Main
{
	public static void main(String[] args)
	{
		displayOutput();
	}
	
	public static void displayOutput()
	{
		List<Integer> primes = new ArrayList<Integer>();
		for(int i = 1; i <= 50; i++)
		{
			if(isPrime(primes, i)) { primes.add(i); }
			boolean isPrime = primes.contains(i);
			System.out.println(i + " is " + (isEven(i) ? "even" : "odd") + (isDivisibleByThree(i) ? ((isPrime ? ", is prime" : "") + ", and is divisble by three.") : ((isPrime ? ", and is prime." : ".") + "")));
		}
	}

	public static boolean isEven(double inputToCheck)
	{
		return inputToCheck % 2 == 0;
	}

	public static boolean isDivisibleByThree(double inputToCheck)
	{
		return inputToCheck % 3 == 0;
	}

	public static boolean isPrime(List<Integer> primes, int inputToCheck)
	{
		boolean isPrime = false;
		isPrime = !((isEven(inputToCheck) && inputToCheck > 2) || (isDivisibleByThree(inputToCheck) && inputToCheck > 3));
		if(isPrime)
		{
			double sqrt = Math.sqrt(inputToCheck);
			
			isPrime = !(isEven(sqrt) || isDivisibleByThree(sqrt) || (Math.round(Math.sqrt(inputToCheck)) == sqrt));
		}
		if(isPrime)
		{
			for(int i = 0; i < primes.size(); i++)
			{
				isPrime = !((inputToCheck > primes.get(i) && inputToCheck % primes.get(i) == 0));
				if(!isPrime)
				{
					break;
				}
			}
		}
		return isPrime;
	}
}
