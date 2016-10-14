//capitalize the first letter of every word
import java.util.*;

import java.io.*;

class capital{
	public static void main(String args[]) throws IOException{
String str=new String();
int n,i;
Scanner sc=new Scanner(System.in);

System.out.println("Enter the string");
    str=sc.nextLine();
StringBuffer str1=new StringBuffer("");
    n=str.length();
    i=0;
for(i=0;i<n;i++)
str1+=StringBuffer.toStringBuffer(str.charAt(i));

for(i=0;i<n;i++)
{
	if(i==0)
	{
		str1.setCharAt(i,str.substring(i,i+1).toUpperCase());

	}
	if(Character.toString(str.charAt(i))==" ")
	{
		i++;
if(Character.toString(str1.charAt(i))!=" ")
{
	str1.setCharAt(i,str.substring(i,i+1).toUpperCase());

}		
	}
}
System.out.println("String provided  "+str);
System.out.println("String provided  "+str1); 
}
}