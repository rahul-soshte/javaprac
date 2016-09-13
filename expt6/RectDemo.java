//Constructor overloading
//Bubble Sort
//Binary Search
//Matrix MUltiplication
class rectangle{
double length,breadth;
rectangle()
{
	length=10;
	breadth=10;
}
rectangle(double l,double b)
{
	length=l;
	breadth=b;
}
rectangle(rectangle ob){
	length=ob.length;
	breadth=ob.breadth;
	
}
double area()
{
return length*breadth;	
}
}

class RectDemo{
	public static void main(String args[])
	{
	rectangle r1=new rectangle();
rectangle r2=new rectangle(4,5);
rectangle r3=new rectangle(r2);
double area;
area=r1.area();
System.out.println("Rect1:Area="+area);
area=r2.area();
System.out.println("Rect2:Area="+area);
area=r3.area();	
System.out.println("Rect3:Area="+area);
}
}
