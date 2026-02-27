import java.util.*;
	public class arrSORT{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of elemnts in an array:");
	int n=sc.nextInt();
	int []arr=new int[n];
	System.out.println("enter the elemnts in the array:");
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
		}
	System.out.println("the array:");
	for(int i=0;i<n;i++){
		System.out.println(arr[i]);
		}
	for(int i=0;i<n-1;i++){
		if(arr[i]>=arr[i+1]){
	System.out.println("not sorted");
		return;
		}
	}
	System.out.println("sorted");
	}
 }