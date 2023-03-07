package java6;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Lambda lam=(x,y)->{
    	 return (long)Math.pow(x, y);  
       };
       int x,y;
       System.out.println("enter base");
       x=new Scanner(System.in).nextInt();
       System.out.println("enter Power");
       y=new Scanner(System.in).nextInt();
       System.out.print(lam.cal(x, y));
	}

}
