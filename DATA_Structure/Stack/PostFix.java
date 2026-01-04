
package Ds_08_Stack;

import java.util.Scanner;

public class PostFix {
          public static void main(String[] args) {
//			Scanner sc=new Scanner(System.in);
//			
//			System.out.println("Enter Expression:");
//			String str=sc.next();
			
			String str1= "12+5a*2+";
		int res=	postFixExp(str1);
		System.out.println(res);
			
			
		}
          
          
          static int postFixExp(String str){
        	  
        	  Stack obj=new Stack(str.length());
        	  
        	  for (int i = 0; i < str.length(); i++) {
        		
        		  if(Character.isDigit(str.charAt(i))) {
        		int x=Integer.parseInt(str.valueOf(str.charAt(i)));
        		
        		   obj.push(x);
        		  }
        		  else if(str.charAt(i)=='+') {
        			  int k=obj.pop();
        			  int l=obj.pop();
        			  int y=k+l;
        			  obj.push(y);
        			  
        		  }
        		  else if(str.charAt(i)=='-') {
        			  int k=obj.pop();
        			  int l=obj.pop();
        			  int y=k-l;
        			  obj.push(y);
        			  
        		  }
        		  else if(str.charAt(i)=='*') {
        			  int k=obj.pop();
        			  int l=obj.pop();
        			  int y=k*l;
        			  obj.push(y);
        			  
        		  }
        		  else if(str.charAt(i)=='/') {
        			  int y=obj.pop()/obj.pop();
        			  obj.push(y);
        			  
        		  }
        		  else
        		  {
        			  System.out.println("Expression Not Valid");
        		  }
        		
        		
				
			}
        	  
        	  return obj.peek();
        	  
        	  
        	  
          }
}
