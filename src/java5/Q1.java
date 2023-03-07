package java5;
import java.util.*;
public class Q1 {

		// TODO Auto-generated method stub
		public static void main(String[] args) {

			Map<Integer,String> m =new HashMap<Integer,String>();

			m.put(2,"aamir@123");

			m.put(3,"farhan@123");

			m.put(1,"sid@123");

			m.put(4,"tushar@123");

			List<String> l=getValues(m);

			for(String s: l)

			System.out.println(s);

			}

			public static List getValues(Map<Integer,String> m) {

			List<String> l = new ArrayList<String>(m.values());

			Collections.sort(l);

			return l;

			}
	

}
