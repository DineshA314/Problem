
public class demo7 {
public static void main(String [] args )
{
	int[] a = {3,4,2,3,16,3,15,16,15,15,16,2,3};
	int tot=1;
	int empty=0;
	int[] b= new int[a.length];
	for(int i=0; i<a.length; i++)
	{
		for(int j=i+1; j<a.length; j++)
		{
			if(a[i]==0)
			{
				break;
			}
			if(a[i]==a[j])
			{
				a[j]=0;
				tot++;
			}
		}
		b[i]=tot;
		tot=1;
		
	}
	for(int i=0; i<a.length; i++)
	{
		if(a[i]!=0)
		{
			System.out.print(a[i]+"=");
			System.out.println(b[i]+",");
		   
		}
	}


}
}
