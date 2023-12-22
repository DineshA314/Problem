
public class demo{
	public static void main(String [] args)
{
		int[] a={2,2,3,4,5,12,2,3,3,3,12};
		int temp=0;
		int num=0;
		int[] nums = new  int [100];
		nums[0]=0;
		
		for(int i=0; i<a.length; i++)
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
			System.out.print(a[i]);
			
			
		}
		int temp1=0;
		temp=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					num++;
					
				}
				else
				{
					
					break;
				}
				i=i+num;
			}
			if(num>temp)
			{
				temp1=temp;
				nums[i]=num;
				num=temp1;
			}
		}
		for(int i=0; i<a.length; i++)
		{		
	        System.out.println(nums[i]);
		}
	
	
}
}