package java3;

import java.util.*;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true)
		{
			System.out.println("Select the option "
					+ "\n 1.Interest Calculator on SB"
					+ "\n 2 for Interest Calculate on FD"
					+ "\n 3 for Interest calculate on RD"
					+ "4 for exit");
			int n=new Scanner(System.in).nextInt();
			System.out.println("enter amount");
			int amount=new Scanner(System.in).nextInt();
			switch(n)
			{
				case 1:{
					System.out.println("enter 1 for NRI and 2 for Normal");
					int citzen=new Scanner(System.in).nextInt();
					if(citzen==1)
						System.out.println(new SBAccount("NRI",amount).calculateInterest());
					else
						System.out.println(new SBAccount("Normal",amount).calculateInterest());
				}
				break;
				case 2:{
					System.out.println("enter days to calculat");
					int day=new Scanner(System.in).nextInt();
					System.out.println("enter age ");
					int age=new Scanner(System.in).nextInt();
					System.out.println("enter name of customer");
					String name=new Scanner(System.in).next();
					System.out.println(new FDAccount( day, age, name, amount).calculateInterest());
				}
				break;
				case 3:{
					System.out.println("enter Month to calculat");
					int Month=new Scanner(System.in).nextInt();
					System.out.println("enter age ");
					int age=new Scanner(System.in).nextInt();
					System.out.print(new RDAccount( Month, age, amount).calculateInterest());
				}
			}
			if(n==4)break;
		}
	}

}
