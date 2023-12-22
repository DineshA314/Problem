
public class primeNumber {
public static void main(String [] args)
{
	int n=4;
	
	int m=0,fl=0;
	
	m=n/2;
	System.out.println(m);
	
	if((n==0)||(n==1))
	{
		System.out.println(n+" is not a prime number");
	}
	else
	{
		for(int i=2; i<=m; i++)
		{
			if(n%i==0)
			{
				System.out.println(n + " is not a prime number");
				fl=1;
				break;
			}
		}
		if(fl==0)
		{
			System.out.println(n + " is a prime number");
		}
	}
		
	
}
}
