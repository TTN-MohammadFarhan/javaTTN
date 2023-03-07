package java2;
import java.util.*;
public class Store {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> list=new ArrayList<String>();
		 while(true)
		 {
			 System.out.println("enter 1 for Insert \n" + "2 for Search \n" +"3 for Delete \n" +"4 Display \n"+"5 Exit");
			 scanner = new Scanner(System.in);
			int  operation=scanner.nextInt();
			 switch(operation)
			 {
				 case 1:{
					 System.out.println("ennter the product item to insert");
					 String sc=scanner.next();
					 list.add(sc);
					 System.out.println("item is added");
				 }
				 break;
				 case 2:{
					 System.out.println("ennter the product item to search");
					 String sc=scanner.next();
					 if(list.contains(sc))
					 System.out.println("item is present");
					 else
						 System.out.println("item is not present");
				 }
				 break;
				 case 3:{
					 System.out.println("ennter the product item to delete");
					 String sc=scanner.next();
					 if(list.remove(sc))
						 System.out.println("item is removed");
					 else 
						 System.out.println("item is not present");
				 }
				 break;
				 case 4:{
					 for(String s:list)
						 System.out.println(s);
				 }
			 }
			 if(operation==5)
				 break;
		 }
		 System.out.println("opeations are over");
	}

}
