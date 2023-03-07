package java6;

import java.util.Scanner;

public class AssignmentQ5 {
	private static Scanner sc;
	public   boolean verification(String username,String password) 
	{
		if(username.equals("user") && password.equals("user"))
            return true;
        
        return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
	   sc=new Scanner(System.in);
		String x,y;
       Auth auth=new AssignmentQ5()::verification;
       x=sc.next();
       y=sc.next();
       System.out.println(auth.auth(x, y)?"authorised for access":"not authorised for access");
	}

}
