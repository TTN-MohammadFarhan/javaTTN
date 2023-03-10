package java10;
public class Odd implements Runnable{
	   int a=1;
	   public void display()
	   {
		   while(a<=20)
		   {  System.out.println("Odd "+a);
			   a+=2;
			   try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   }
	   }
	   
	   public void run()
	   {
		  display();
	   }
	}