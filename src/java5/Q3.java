package java5;
import java.util.*;
public class Q3 {
	public static Map getSquares(int [] arr)
	{
		 Map<Integer,Long> mp=new HashMap<Integer,Long>();
		 for(int i:arr)
			 mp.put(i,(long) (i*i));
		 return mp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=new Scanner(System.in).nextInt();
		int arr[]=new int[n];
		Map<Integer,Long> ans=getSquares(arr);
		for( Map.Entry<Integer,Long> entry : ans.entrySet())
		{
			System.out.print(entry.getKey()+":"+entry.getValue());;
		}
		
	}

}
