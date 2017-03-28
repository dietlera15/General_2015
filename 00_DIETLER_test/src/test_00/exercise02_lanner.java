package test_00;

public class exercise02_lanner {

	public static void main(String[] args)
	{
		int year;
				
		for (year = 1900; year <= 2015; year ++)
		
		if (year % 400 == 0)	
		{
			System.out.println(year + " ist ein Schaltjahr.");
		}
		else if ((year % 100) != 0 || (year % 4) == 0)
		{
			System.out.println( year + " ist ein Schaltjahr.");
		}
		else
		{
			System.out.println(year + " ist kein Schaltjahr.");
		}
	
	}

}
