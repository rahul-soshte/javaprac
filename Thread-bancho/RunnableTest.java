
class X implements Runnable{
	public void run(){
		for(int j=1;j<=10;j++)
		{
			System.out.println("\tFrom Thread X:j="+j);
		}
		System.out.println("Exit from B");

	}
}
class RunnableTest
{
	public static void main(String args[])
	{
		X runnable=new X();
		Thread threadX=new Thread(runnable);
threadX.start();
System.out.println("End of MAin Thread");

			}
}