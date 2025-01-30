
public class Occurrence {
public static void main(String [] args)
{
	String a = "occurrence";
	String b="";
	int c=0,fl=0;
	
	for(int i=0; i<a.length(); i++)
	{
		for(int p=0; p<b.length(); p++)
		{
			if(a.charAt(i)==b.charAt(p))
			{
				fl=1;
				break;
			}
		}
		if(fl==0)
		{
			b=b+a.charAt(i);
			for(int j=i; j<a.length(); j++)
			{
				if(a.charAt(i)==a.charAt(j))
				{
		            c++;
				}
				
			}
			b=b+c;
		}
		fl=0;
		c=0;
	}
	System.out.println(b);

	
}
}