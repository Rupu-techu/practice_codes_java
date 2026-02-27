import java.util.*;
	public class arrREV{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no. of elements u wanna enter:");
	int n=sc.nextInt();
	int []arr=new int[n];
	System.out.println("enter the elements:");
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	System.out.println("the array before reverse:");
	for(int i=0;i<n;i++){
		System.out.println(arr[i]);
	}
	
	for(int i=0;i<n/2;i++){
		int temp=arr[i];
		arr[i]=arr[n-1-i];
		arr[n-1-i]=temp;
	}
	System.out.println("the array AFTER reverse:");
	for(int i=0;i<n;i++){
		System.out.println(arr[i]);
	}	
	}
 }



	