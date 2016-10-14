class A
{
int i, j;
A(int a, int b)
{
i = a;
j = b;
}
// display i and j
void show()
{
System.out.println("i and j: " + i + " " + j);
}
}
class B extends A
{
int k;
B(int a, int b, int c)
{
super(a, b);
k = c;
}
// display k – this overrides show() in A
void show()
{
System.out.println("k: " + k);
}
}
class Override
{
public static void main(String args[])
{
B b1 = new B(10, 20, 30);
b1.show(); // this calls show() in B
}
}
