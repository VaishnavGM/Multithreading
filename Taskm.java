package Stringnew;

public class Taskm {

	public static void main(String[] args) throws InterruptedException {
uniq obj1 = new uniq();
tech obj2 = new tech();
obj1.start();
obj1.join();
obj2.start();

}}

	class uniq extends Thread{
		public void run() {
			for(int i =1;i<=100;i++)
			{
				if(i%2==0)
				{
					System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
				}
			}}}
			class tech extends Thread
			{
				public void run() {
					for(int j =1;j<100;j++)
					{
						if(j%2!=0)
						{
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println(j);
						}
					}
				}
			}
		
	
