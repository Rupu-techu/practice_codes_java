import java.util.*;
public class s{
	public static void main(String[]args){
	Scanner m=new Scanner(System.in);
	System.out.println("enter the string:");
	String str=m.nextLine();
	System.out.println("no. of double space string has:" + str.indexOf("  "));
	System.out.println("no. of triple space string has:" + str.indexOf("   "));
	}
}