package java10;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Even e=new Even();
		Odd o=new Odd();
		Thread even=new Thread(e,"Even");
		Thread odd=new Thread(o,"odd");
		
		even.start();
		odd.start();

	}

}
