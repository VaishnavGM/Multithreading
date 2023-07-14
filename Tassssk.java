package Vaish;

public class Tassssk {

	public static void main(String[] args) { 
		Ml s = new Ml();
		s.start();
		Ms r = new Ms();
		r.start();
 
	}
}



class Ml extends Thread
{
 public void run()
	{
		System.out.println(Thread.currentThread().getId());
		}
}

class Ms extends Thread
{
public void run()
{
	System.out.println(Thread.currentThread().getName());
}
}
