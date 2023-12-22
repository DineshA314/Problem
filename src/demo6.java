
public class demo6 {
public static void main(String [] args) {
	
	int[] a= {1,3 ,10, 7, 9, 2, 4, 6};
	int temp=0,s=0;
	for(int i=0; i<a.length; i++)
	{
		for(int j=i+1; j<a.length; j++)
		{
			if(a[i]>a[j])
			{
				temp = a[i];
				a[i]= a[j];
				a[j]= temp;
			}
		}
	}
	int[] empty = new int [a.length];
	int tot= a[0];
	int sum=0;
	for(int i=0; i<a.length; i++)
	{	
		if(tot==a[i])
		{
			
			sum++;
			tot++;
		}
		else 
		{
			tot = a[i];
			if(s<sum)
			{
				s=sum;
				i=i-s;
				for(int p=0; p<s;p++)
				{
					empty[p]= a[i];
					i++;
				}
				
				
			}
			sum=0;
			i--;
		}
		
		
	}
	if(s<sum)
	{
		s=sum;
		
	}
	for(int i=0; i<s; i++)
	{
		System.out.print(empty[i]+",");
	}
}
}
