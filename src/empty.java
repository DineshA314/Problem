

	import java.util.Stack;

	public class empty {
	    public static boolean para(String a) {
	        Stack<Character> s = new Stack<>();
	        
	        for (int i = 0; i < a.length(); i++) {
	            char currentChar = a.charAt(i);
	            
	            if (currentChar == '(' || currentChar == '{' || currentChar == '[') 
	            {
	                s.push(currentChar);
	            } else 
	            {
	                if (s.isEmpty()) 
	                {
	                    return false;  // There is a closing bracket without a corresponding opening bracket.
	                }
	                char top = s.pop();
	                
	                if (currentChar == ')' && top != '(') 
	                {
	                    return false;
	                } else if (currentChar == '}' && top != '{') 
	                {
	                    return false;
	                } else if (currentChar == ']' && top != '[') 
	                {
	                    return false;
	                }
	            }
	        }
	        
	        return s.isEmpty();
	    }
	    
	    public static void main(String[] args) {
	        String a = "[()]{[()][]}";
	        
	        if (para(a)) {
	            System.out.print("true");
	        } else {
	            System.out.print("false");
	        }
	    }
	}
