import java.util.*;
public class arr2D{
	public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of rows:\n");
	int r=sc.nextInt();
	System.out.println("enter the number of column:\n");
	int c=sc.nextInt();
	int [][] arr=new int [r] [c];
	System.out.println("enter the elements in multidimension array (2d/matrix):\n");
	for(int i=0;i<r;i++){
		for(int j=0;j<c;j++){
			arr[i][j]=sc.nextInt();
			}
	}
	System.out.println("the multidimension array (2d/matrix):\n");
	for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(arr[i][j]);
				System.out.print(" ");
				}
         System.out.println();
	}
	

	System.out.println("TRAVERSING THE multidimension array (2d/matrix):\n");
	
	System.out.println("row length:" + arr.length);

	System.out.println("column length:\n" + arr[0].length);
					 
	
	for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr[i].length;j++){
					System.out.println("the element: " + arr[i][j] + " is at row: " + i + " and at column: " + j);
					}
	}

	System.out.println("enter the element you want to search: ");
	int k=sc.nextInt();
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]==k){
					System.out.println("the element: " + arr[i][j] + " is at row: " + i + " and at column: " + j);
					return;
					}
		}
	}
	System.out.println("not found");
   }
}







	


