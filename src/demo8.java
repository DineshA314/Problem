import java.util.*;
public class demo8 {
public static void main(String[] args) {
	int size;
	Scanner in = new Scanner(System.in);
	
	int size1 = in.nextInt();
	
	int sav1[] = new int [size1];
	
	for(int i=0; i<size1; i++)
	{
		sav1[i] = in.nextInt();
	}
	System.out.print("*");
	int size2 = in.nextInt();
	int sav2[] = new int [size2];
	for(int i=0; i<size2; i++)
	{
		sav2[i] = in.nextInt();
	}
	System.out.print("*");
	int fl=0;
	
		for(int i=0; i<size1; i++)
		{
			for(int j=0; j<size2; j++)
			{
				if(sav1[i]==sav2[j])
				{
					fl=1;
					break;
				}
				
			}
			if(fl==0)
			{
				System.out.print(sav1[i]+",");
			}
			else
			{
				fl=0;
			}
		}
		System.out.println("+");
		for(int i=0; i<size2; i++)
		{
			for(int j=0; j<size1; j++)
			{
				if(sav2[i]==sav1[j])
				{
					fl=1;
					break;
				}
				
			}
			if(fl==0)
			{
				System.out.print(sav2[i]+",");
			}
			else
			{
				fl=0;
			}
		}
		System.out.println("+");
		
		
	
	
	
}
}
