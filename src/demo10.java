//Alternate sorting
public class demo10 {
public static void main(String [] args)
{
	int [] a = {1,2,3,4,5,6,7};
	int temp=0;
	for(int i=0; i<a.length; i++)
	{
		if(i%2==0)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]= a[j];
					a[j]=temp;
				}
			}
		}
		else
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]= a[j];
					a[j]=temp;
				}
			}
			
		}
		
	}
	
	for(int i=0; i<a.length; i++)
	{
		System.out.print(a[i]);
	}
	
}
}
