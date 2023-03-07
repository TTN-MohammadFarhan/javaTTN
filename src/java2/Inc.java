package java2;
import java.util.Scanner;

public class Inc {
	public static boolean checkNumber(int [] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]>arr[i])return false;
		}
		return true; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n=new Scanner(System.in).nextLine();
		
		int arr[]=new int[n.length()];
		for(int i=0;i<n.length();i++)
			arr[i]=n.charAt(i)-'0';
		
		String st=checkNumber(arr)?"is increasing number ":"not increasing number";
		
		System.out.print(st);
		
	}

}
