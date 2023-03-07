package java2;
import java.util.*;

public class SecondLar {
	static int  getSecondSmallest(int arr[],int arr_size)
			{
			int i, first, second;
		
			if (arr_size < 2){
				System.out.printf(" Invalid Input ");
			return -1;
			}
			
			Arrays.sort(arr);
			for (i = arr_size - 2; i >= 0; i--){
				
				if (arr[i] != arr[arr_size - 1])
				{
				System.out.printf("The second largest " +
				          "element is %d\n", arr[i]);
				return arr[i];
				}
			
			}
			
			return -1;
			} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n=new Scanner(System.in).nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=new Scanner(System.in).nextInt();
		
		System.out.print(getSecondSmallest(arr,n));
	}

}