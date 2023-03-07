package java7;

public class DemoThread extends Thread{
	@Override
    public void run() {
    	System.out.println("Thread Started"+Thread.currentThread().getName());
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoThread t1=new DemoThread();
		t1.start();
		//Runnable re=()->System.out.print("this is thraed");
		Thread t2=new Thread(()->System.out.print("this is thraed"));
		t2.start();
		
	}

}
