package java6;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string in which u want to add space");
		String st=new Scanner(System.in).next();
		LambadString lmbs=(s)->{
			String ans="";
			for(int i=0;i<s.length();i++)
						ans+=s.charAt(i) +" ";
			return ans;
		};
		System.out.println(lmbs.space(st));
	}

}
