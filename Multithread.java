package Stringnew;

public class Multithread {

	public static void main(String[] args) {
A m = new A();	
m.start();
System.out.println(m.getState());
B n = new B();	
n.Methodss();
System.out.println(m.getState());
	}}

class A extends Thread
{
	public void run() {
		try {
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
		
		}
		System.out.println("sleep");
		
	}}
	class B 
	{
		public void Methodss() {
			System.out.println("not sleep");
		}
	}
	
	


