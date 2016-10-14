class Student
{
int rollnumber;
void getnumber(int n)
  {
    rollnumber=n;
  }
void putnumber()
   {
     System.out.println("Roll No:"+rollnumber);
   }
}  
class Test extends Student   
{
float part1,part2;
void getmarks(float m1,float m2)
   {
     part1=m1;part2=m2;
    }
void putmarks()
   {
     System.out.println("Marks Obtained");
    System.out.println("Part1="+part1+"\nPart2="+part2);
    }
}
interface sports
{
float sportwt=6.0f;
void putwt();
}
class Results extends Test implements sports
{
float total;
public void putwt()
{
System.out.println("Sport weight="+sportwt);
}
void display()
{
total=part1+part2+sportwt;
putnumber();
putmarks();
putwt();
System.out.println("Total Score="+total);
}
}
class Student1
{
public static void main(String[] args)
{
Results s1=new Results();
s1.getnumber(1234);
s1.getmarks(27.5f,33.0f);
s1.display();
}
}
