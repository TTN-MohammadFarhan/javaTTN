package java7;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=()->
		{
			String str="HELLO java";
			for(int i=0;i<str.length();i++)
			{
				System.out.println(str.charAt(i));
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		};
		
		Thread t=new Thread(r);
		t.setDaemon(true);
		t.start();
		
		String str1="MAIn";
		for(int i=0;i<str1.length();i++)
		{
			System.out.println(str1.charAt(i));
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}

}
