package java10;

import java.time.LocalDateTime;

public class Q3 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runnable r=()->{
			
			while(true) {
				LocalDateTime ld=LocalDateTime.now();
				System.out.println(ld.getHour()+":"+ld.getMinute()+":"+ld.getSecond());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t=new Thread(r);
		t.start();
	}

}
