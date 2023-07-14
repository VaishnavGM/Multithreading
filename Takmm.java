package Stringnew;

public class Takmm {

	public static void main(String[] args) {
Ragnar r = new Ragnar();
Bjorn b = new Bjorn();
r.start();
b.start();
r.setPriority(5);

		}

}
class Ragnar extends Thread
{
	public void run()
	{
		for(int i =1;i<20;i++)
		{
			System.out.println("hi");
		}
	}
}
class Bjorn extends Thread
{
	public void run()
	{
		for(int j =1;j<20;j++)
		{
			System.out.println("hello");
		}
	}
}
