import java.util.*;
	public class arrMAXMIN{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of element u wanna enter:");
	int n=sc.nextInt();
	int [] arr=new int[n];
	System.out.println("enter the element:");
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	
	System.out.println("the array:");
	for(int i=0;i<n;i++){
		System.out.println(arr[i]);
	}
	
	int max=arr[0];
	int min=arr[0];
		for(int i=0;i<n;i++){
			if(arr[i]>max){
				max=arr[i];
				}
				else if(arr[i]<min){
					min=arr[i];
					}
				}
			

	System.out.println("the maximum element in the array:" + max);
	System.out.println("the mimum element in the array:" + min);

	}
 }