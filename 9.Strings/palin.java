//Palindrome
import java.util.*;

class palin{
	public static void main(String args[]){
String str=new String();
int n,i;

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
    str=sc.next();

    n=str.length();    
 String str1=new String();
str1="";

    for(i=n-1;i>=0;i--)
    {
   str1+=str.charAt(i);
    }
    //Check palin or not
System.out.println("String provided  "+str);
System.out.println("Reversed String  "+str1);
 
    if(str.equalsIgnoreCase(str1))
    {
System.out.println("String is Palindrome");

    }
    else
    	System.out.println("String is Not Palindrome");

	}
}