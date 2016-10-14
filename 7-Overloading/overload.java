class OverloadDemo{
void test()
{
System.out.println("No parameter");
}
void test(int a)
{
System.out.println("a="+a);
}
void test(int a, int b)
{
System.out.println("a="+a+","+
"b="+b);
}
double test(double a)
{
System.out.println("double a:"+a);
return a*a;
}
}

class overload{
public static void main(String args[])
{
double result;
OverloadDemo ob=new OverloadDemo();
ob.test();
ob.test(10);
ob.test(10,20);
result=ob.test(5.00);
System.out.println("Result of mat="+result);

}
}hu