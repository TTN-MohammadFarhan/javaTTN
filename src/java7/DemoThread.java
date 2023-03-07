package java7;
class Demo implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread Started..."+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class DemoThread extends Thread{
	@Override
    public void run() {
    	System.out.println("Thread Started"+Thread.currentThread().getName());
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoThread t1=new DemoThread();
		t1.start();
		
		
		Demo obj=new Demo();
		Thread t2= new Thread(obj,"farhan");
		Thread t4= new Thread(obj,"farhan");
		Thread t5= new Thread(obj,"farhan");
		t4.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t5.setPriority(Thread.NORM_PRIORITY);
		
		t4.start();
		try {
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t5.start();
		t2.start();
		
		//Runnable re=()->System.out.print("this is thraed");
		Thread t3=new Thread(()->System.out.print("aamir"));
		t3.setPriority(Thread.MIN_PRIORITY);
		t3.start();
		
	}

}
