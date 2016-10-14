
import java.io.*;
interface Area
{
double PI=3.14;
double area();
}
class Rectangle implements Area
{
double length,breadth;
Rectangle(double l,double b)
{
length=l;
breadth=b;
}
public double area() 
{return length*breadth;
}
}
class Circle implements Area
{
double radius;
Circle(double r)
{radius=r;
}
public double area()
{return PI*radius*radius;
}
}
class Triangle implements Area
{
double base,height;
Triangle(double b,double h)
{
base=b;
height=h;
}
public double area()
{return 0.5*base*height;
}
}
class InterfaceDemo
{
public static void main(String args[]) throws IOException
{
Area ref=null;
int option;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
do
{System.out.println("1.Rectangle,2.Circle3.Triangle,4.Quit");
System.out.println("Enter one option=");
option=Integer.parseInt(br.readLine());
switch (option)
{
case 1:ref=new Rectangle(10,5);
       System.out.println("Rectangle");
       break;
case 2:ref=new Circle(2);
       System.out.println("Circle");
       break;
case 3:ref=new Triangle(4,5);
       System.out.println("Triangle");
       break;
}System.out.println("Area="+ref.area());
}while(option!=4);
}
}
