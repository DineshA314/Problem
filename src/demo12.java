
public class demo12 {
public static void main(String [] args)
{
	int [] a = {3,6,4,8,5,5};
	
	int b=0;
	for(int i=0; i<a.length; i++)
	{
		if(a[i]%2==0)
		{
			b=b+a[i];
			//System.out.println(a[i]);
		}
		else
		{
			if(i==0)
			{
				b=b+a[i];
			}
			else if(a[i-1]%2!=0)
			{
				b=b+a[i];
			}
		}
	}
	System.out.println(b);
}
}


//26