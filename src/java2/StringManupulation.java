package java2;
import java.util.*;
public class StringManupulation {
	
	static String[] sortStrings(String[] s,int len) {
		Arrays.sort(s);
		for(int i=0;i<len;i++) {
			int sl=s[i].length();
			sl=sl/2 +1;
			s[i]=s[i].substring(0,sl+1).toUpperCase()+s[i].substring(sl,s[i].length()).toLowerCase();		
			}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enetr the string length");
		int  n=new Scanner(System.in).nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++)
			arr[i]=new Scanner(System.in).nextLine();
		String newArr[]=sortStrings(arr,n);
		for(String s:newArr)
			System.out.println(s);	
	}
}