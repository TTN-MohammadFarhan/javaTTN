package java7;

public class VolatileAccount implements Runnable{
	private volatile double balance=25000;
	private  void withdraw(String name , double amt)
	{
		if(amt<balance) {
			//what is we comment line 9 and 10 than it will not give entry to thread that have balance negative
			System.out.println(name + " is going to withdraw ");
			//System.out.println(name + " going to withdraw "+amt);
			balance -=amt;
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
