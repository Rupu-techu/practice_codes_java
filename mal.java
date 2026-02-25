import java.util.*;
public class mal{
	public static void main(String[]args){
	int mul=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number for multiplication table:");
	int n=sc.nextInt();
	System.out.println("enter the range for the multiplication table");
	int y=sc.nextInt();
	System.out.println("the multiplication table is:\n\t");
	for(int j=0;j<=y;j++){
	mul=j*n;
	System.out.printf("\n%d x %d =%d\n" ,j,n,mul);
	}
     }
}

