import java.util.Scanner;
public class Main{
	public static void main(String[]args){
        float sum,p;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the marks for maths");
	float a=sc.nextFloat();
	System.out.println("enter the marks for English");
	float b=sc.nextFloat();
	System.out.println("enter the marks for bengali");
	float c=sc.nextFloat();
	System.out.println("enter the marks for history");
	float d=sc.nextFloat();
	System.out.println("enter the marks for geography");
	float e=sc.nextFloat();
	System.out.println("the percentage of the student is:");
	sum=a+b+c+d+e;
	p=(sum/500)*100;
	System.out.println("the sum is:"+ sum);
	System.out.println("percentae is:"+ p);
 }
}


