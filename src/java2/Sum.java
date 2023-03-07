package java2;

import java.util.Scanner;
public class Sum{
	public static long calculateSum(int n) {
		long sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0)
				sum+=i;
		}
		return sum;
	}
	public static void main(String args[])
	{
		int n=new Scanner(System.in).nextInt();
		System.out.println(calculateSum(n));
		return;
	}
}