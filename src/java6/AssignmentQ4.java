package java6;

import java.util.Scanner;

public class AssignmentQ4 {
  private static Scanner scanner;
public String addSpace(String s)
  {
	  String ans="";
		for(int i=0;i<s.length();i++)
					ans+=s.charAt(i) +" ";
		return ans;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambadString lams=new AssignmentQ4()::addSpace;
		scanner = new Scanner(System.in);
		System.out.println("enter name in which you want to add space");
		String st=scanner.next();
		System.out.print("fianl output :"+lams.space(st));
	}

}
