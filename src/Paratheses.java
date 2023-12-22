import java.util.*;

public class Paratheses 
{
    public static boolean para(String a)
	{
		Stack<Character> s = new Stack<>();	
		char x ;
		
		
		for(int i=0; i<a.length(); i++)
		{
			
			if((a.charAt(i)=='(')||(a.charAt(i)=='{')||(a.charAt(i)=='['))
			{
				s.push(a.charAt(i));
				continue;
			}
			if(s.empty())
			{
				return false;
				
			}
			
			switch(a.charAt(i))
			{
			case ')':
					x=s.peek();
					s.pop();
				 
					if(( x =='{')||(x=='['))
					{	
						return false;
					}
					break;
					
			case '}':
					x=s.peek();
					s.pop();
					if(( x =='(')||(x =='['))
					{
						return false;
					}
					break;
					
			case ']':
					x=s.peek();
					s.pop();
					if((  x =='{')||(x =='('))
					{
						return false;					
					}
					break;
			}	
		}
		return (s.empty());
	}
public static void main(String[] args)
{
	String a= "[()]{[()][]}()";

	if(para(a))
	{
		System.out.print("ture");
		
	}
	else
	{
		System.out.print("false");
	}

}
}

//public class empty {
//    public static boolean para(String a) {
//        Stack<Character> s = new Stack<>();
//        
//        for (int i = 0; i < a.length(); i++) {
//            char currentChar = a.charAt(i);
//            
//            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
//                s.push(currentChar);
//            } else {
//                if (s.isEmpty()) {
//                    return false;  // There is a closing bracket without a corresponding opening bracket.
//                }
//                char top = s.pop();
//                
//                if (currentChar == ')' && top != '(') {
//                    return false;
//                } else if (currentChar == '}' && top != '{') {
//                    return false;
//                } else if (currentChar == ']' && top != '[') {
//                    return false;
//                }
//            }
//        }
//        
//        return s.isEmpty();
//    }
//    
//    public static void main(String[] args) {
//        String a = "[()]{[()][]}";
//        
//        if (para(a)) {
//            System.out.print("true");
//        } else {
//            System.out.print("false");
//        }
//    }
//}
//
