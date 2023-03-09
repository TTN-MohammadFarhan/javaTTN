package java7;

public class ThreadPool1 {
	public static void main(String[ ] args)
	{
		Runnable r=()->System.out.println(Thread.currentThread().getName()+"--- is running");
		
		for(int i=0;i<50;i++)
		{
			Thread t=new Thread(r);
			t.start();
		}
	}

}
