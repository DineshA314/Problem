
public class NextGreaterElement {
public static void main(String [] args)
{
	int [] num = {13,7,6,12};
	int [] n = new int [num.length];
	
	int fl=0;
	for(int i=0; i<num.length; i++)
	{
		for(int j=i+1; j<num.length; j++)
		{
			if(num[i]<num[j])
			{
				fl=1;
				n[i]=num[j];
				break;
			}
			
		}
		if(fl==0)
		{
			n[i]=-1;
		}
		else
		{
			fl=0;
		}
		
	}
	for(int i=0; i<num.length; i++)
	{
		System.out.print(n[i]+",");
	}
}
}
