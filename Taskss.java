package Vaish;

public class Taskss {

	public static void main(String[] args) throws InterruptedException {
		Floki f = new Floki();
		Ram r = new Ram();
		Thread t1 = new Thread(r);
f.start();
f.join();
t1.start();
t1.join();
System.out.println("end");
	}}
	
class Floki extends Thread
{
	public void run()
	{
		System.out.println("s");
	}
}
class Ram implements Runnable
{
	public void run()
	{
		System.out.println("k");
	}
}
