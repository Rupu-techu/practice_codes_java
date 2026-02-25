import java.util.*;
public class arr{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number how many elements you want in array:");
	int n=sc.nextInt();
	int [] array=new int[n];
	System.out.println("enter the elements:");
	for(int i=0;i<n;i++){
	array [i]=sc.nextInt();
	}
	System.out.println("the array :" );
	for(int i=0;i<n;i++){
	System.out.println(array[i]);
	}

	int r=array.length;
	System.out.println("the length of the array is:" + r);

	for(int i=0;i<array.length;i++){
	System.out.println("index: " + i + "  value: " + array[i]);
	}

	System.out.println("which element you want to find:");
	int i;
	int k=sc.nextInt();
	for(i=0;i<n;i++){
	if(array[i]==k){
	System.out.println("the element " + k + " is found at the index: : " + i);
	break;
	}
	
    }
	if(i==n){
	System.out.println("the element is not found");
	    }	
	

      }
}