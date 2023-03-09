package java7;

import java.util.concurrent.atomic.AtomicInteger;

public class UseOfAtomic implements Runnable{
	private AtomicInteger balance =new AtomicInteger();
	private  void withdraw(String name , int amt)
	{
		if(amt<balance.get()) {
			//what is we comment line 9 and 10 than it will not give entry to thread that have balance negative
			//System.out.println(name + " is going to withdraw ");
			//System.out.println(name + " going to withdraw "+amt);
			balance.set(balance.get()-amt);
			System.out.println("withdraw Complate .... for "+name);
			System.out.println("available balance ---> "+balance +" for "+name);
		}
		else {
			System.out.println(name+"have no enough money ");
		}
	}
	public void run() {
		withdraw(Thread.currentThread().getName(),15000);
	}

}
