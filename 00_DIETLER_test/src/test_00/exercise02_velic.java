package test_00;

public class exercise02_velic {

	public static void main(String[] args)
	{	
		int i;

		for (i = 1900; i <= 2015; i++)
		if (i % 400 == 0)
		{
			System.out.println(i + " ist ein Schaltjahr!");
		}else if(i % 100 == 0)
		{
			System.out.println(i +" ist kein Schaltjahr!");
		}else if (i % 4 == 0)
		{
			System.out.println(i + " ist ein Schaltjahr!");
		}else{
			System.out.println(i +" ist kein Schaltjahr!");
		}
	
	
	}
}

