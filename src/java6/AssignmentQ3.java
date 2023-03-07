package java6;

import java.util.Scanner;

public class AssignmentQ3 {
    private static Scanner scanner;
	public double factCalculate(double x,double y)
    {
		return Math.pow(x, y);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lambda fact=new AssignmentQ3()::factCalculate;
		scanner = new Scanner(System.in);
		System.out.println("enter number base");
		double x=scanner.nextDouble();
		 double y=scanner.nextDouble();
		System.out.println(fact.cal(x,y));
	}

}
