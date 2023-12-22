import java.util.Scanner;

public class demo9 {
public static void main(String [] args)
{
    Scanner in = new Scanner (System.in);
	
	int size=in.nextInt();
	int[] n = new int[size];
	for(int i=0; i<size; i++)
	{
		n[i]= in.nextInt();
	}
	int[] a= new int [size];
	int k=0;
	int m=0,fl=0;
	for(int i=0; i<size; i++)
	{
		m=n[i]/2;
		System.out.println(m);
		
		if((n[i]==0)||(n[i]==1))
		{
			continue;
		}
		else
		{
			for(int j=2; j<=m; j++)
			{
				if(n[i]%j==0)
				{
					
					fl=1;
					break;
				}
			}
			if(fl==0)
			{
				a[k]=n[i];
				k++;
			}
		}
	}
	for(int i=0; i<k; i++)
	{
		System.out.print(a[i]);
	}
	
}
}
