
public class demo11 {
public static void main(String [] args) {
	String a = "((abc)((de))";
	int c=0, b=0;
	for(int i=0; i<a.length(); i++)
	{
		if(a.charAt(i)=='(')
		{
			b++;
		}
		if(a.charAt(i)==')')
		{
			c++;
		}
	}
}
}
