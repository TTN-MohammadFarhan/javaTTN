 package java7;

class MyThread implements Runnable{
	public static void printMessage(String name)
	{
		//we want to use static 
		synchronized(Object.class) {
		for(int i=0;i<50;i++) {
			System.out.println(name);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
		System.out.println("End of Method");
	}
	public void run() {
		printMessage(Thread.currentThread().getName());
	}
}

public class SyncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread obj=new MyThread();
		Thread t1=new Thread(obj,"a");
		Thread t2=new Thread(obj,"b");
		Thread t3=new Thread(obj,"c");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
