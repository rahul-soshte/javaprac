import java.util.*;


class VectorDemo{
//@SuppressWarnings("unchecked","rawtypes")
@SuppressWarnings(value = {"unchecked","rawtypes"})

	public static void main(String args[])
	{

		int i,choice;
		Scanner sc=new Scanner(System.in);
		String str=new String();

	Vector v=new Vector(3,2);
		System.out.println("Initial size"+v.size());
		System.out.println("Initial capacity"+v.capacity());
	v.addElement("1");
	v.addElement("2");
	v.addElement("3");
	v.addElement("4");

	System.out.println("Capaciy after addition "+v.capacity());
 
	if(v.contains("3")){
		System.out.println("Vector contains 3");
			}		
	
int size=v.size();
String list[]=new String[size];

v.copyInto(list);

System.out.println("Elements are");
for(i=0;i<size;i++)
{
	System.out.println(list[i]);

}


do{
System.out.println("1.AddElement\n2.DeleteElement\n3.Display Element\n4.Exit\nEnter your choice");

choice=sc.nextInt();
switch(choice)
{
	case 1:System.out.println("Enter name and index");
	str=sc.next();
	i=sc.nextInt();

	v.insertElementAt(str,i);
	break;
	case 2:System.out.println("Enter the element you want to delete");
      str=sc.next();

       v.removeElement(str);
       break;

       case 3:for(i=0;i<v.size();i++)
       {
       	System.out.println(v.elementAt(i));

       }
       break;

   }
}while(choice!=4);

}
}