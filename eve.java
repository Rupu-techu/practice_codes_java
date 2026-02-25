import java.util.*;
public class eve{
	public static void main(String[]args){
	int i=1,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the nth number:");
	int n=sc.nextInt();
	while(n>=i){
		if(i%2==0){
		sum=sum+i;
		}
		i++;
	    }
System.out.println("sum of the nth even number is:" +sum);
	}
 }
