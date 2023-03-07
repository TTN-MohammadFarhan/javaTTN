package java6;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial cal=(n)->{
			long ans=1;
			for(int i=1;i<=n;i++)
				ans=ans*i;
			return ans;
		};
		
		System.out.println("enter number and get its factorial");
		int n=new Scanner(System.in).nextInt();
		
		System.out.println(cal.cal(n));
	}

}
