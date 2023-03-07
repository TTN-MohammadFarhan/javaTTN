package java6;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auth auth=(username,password)->{
			if(username.equals("user") && password.equals("user"))
	            return true;
	        
	        return false;
		};
		System.out.println("enter user name");
	    String username=new Scanner(System.in).next();
	    

		System.out.println("enter password");
	    String password=new Scanner(System.in).next();
	    
	    System.out.println(auth.auth(username, password));
	    
	}

}
