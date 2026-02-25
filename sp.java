import java.util.*;
public class sp{
	public static void main(String[]args){
	Scanner s=new Scanner(System.in);
	System.out.println("enter the string:");
	String str=s.nextLine();
	System.out.println("enter name :");
	String n=s.nextLine();
	String newstr=str.replace("<|name|>", n);
	System.out.println("the string:" + newstr);
	}
     }


