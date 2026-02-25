import java.util.*;
public class fact{
	public static void main(String[]args){
	int f=1;
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the number for factorial:");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++){
	f=f*i;
	}
	System.out.printf("the factorial of %d is %d",n,f);
	}
  }
