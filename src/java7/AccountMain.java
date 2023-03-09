package java7;
//import java.util.concurrent.atomic.*;
//javutil.concurrent
public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc=new Account();
		Thread t1=new Thread(acc,"Yatin");
		Thread t2=new Thread(acc,"farhan");
		Thread t3=new Thread(acc,"ammir");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
