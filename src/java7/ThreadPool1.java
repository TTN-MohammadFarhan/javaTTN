package java7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool1 {
	public static void main(String[ ] args)
	{
		Runnable r=()->System.out.println(Thread.currentThread().getName()+"--- is running");
		ExecutorService service=Executors.newFixedThreadPool(5);
		for(int i=0;i<50;i++)
		{
//			Thread t=new Thread(r);
//			t.start();
			service.execute(r);
		}
	}

}
