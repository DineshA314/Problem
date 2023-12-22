
public class hollowpattern {
public static void main(String[] args)
{
	int n=9;
	
	int size= n*2-1;
	int front = 0;
	int last = size-1;
	int a[][]= new int [1000][1000];
	
	while(n!=0)
	{
		for(int i=front; i<=last; i++)
		{
			for(int j=front; j<=last; j++)
			{
				if(i==front|| j==last || i==last|| j== front)
				{
					a[i][j]=n;
				}
			
			}
		}
		front++;
		last--;
		n--;
	}
	
	for(int i=0; i<size ; i++)
	{
		for(int j=0; j<size ; j++)
		{
			System.out.print(a[i][j]);
		}
		System.out.println();
		
	}
}
}
