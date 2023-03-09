package java7;

public class Account implements Runnable{
	private double balance=25000;
	private synchronized void withdraw(String name , double amt)
	{
		if(amt<balance) {
			System.out.println(name + " going to withdraw "+amt);
			balance -=amt;
			System.out.println("withdraw Complate .... for "+name);
			System.out.println("available balance ---> "+balance);
		}
		else {
			System.out.println(name+"have no enough money ");
		}
	}
	public void run() {
		withdraw(Thread.currentThread().getName(),15000);
	}

}
