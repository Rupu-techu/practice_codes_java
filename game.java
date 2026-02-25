import java.util.*;
public class game{
	public static void main(String[]args){
	int i=0;
	Random r=new Random();
	int num=r.nextInt(3);
	Scanner sc=new Scanner(System.in);
	while(i<5){
		System.out.println("enter your choice:\n\t0:rock\n\t1:paper\n\t2:scissors");
		int str=sc.nextInt();
		switch(num){
	       
		case 0:
			if(str==0){
				System.out.println("you choose rock");
				System.out.println("computer also choose rock\n\tDRAW\n\tTT ");
				}
			else if(str==1){
				System.out.println("you choose paper");
				System.out.println("computer choose rock\n\tyou lose\n\t;(");
				}
			else if(str==2){
				System.out.println("you choose scissors");
				System.out.println("computer choose rock\n\tyou WIN\n\t:)");
				}
			break;
		case 1:
			if(str==0){
				System.out.println("you choose rock");
				System.out.println("computer also choose paper\n\tyou lose\n\t;( ");
				}
			else if(str==1){
				System.out.println("you choose paper");
				System.out.println("computer choose paper\n\tDRAW\n\tTT");
				}
			else if(str==2){
				System.out.println("you choose scissors");
				System.out.println("computer choose paper\n\tyou WIN\n\t:)");
				}
			break;
		case 2:
			if(str==0){
				System.out.println("you choose rock");
				System.out.println("computer also choose scissors\n\tyou WIN\n\t:)");
				}
			else if(str==1){
				System.out.println("you choose paper");
				System.out.println("computer choose scissors\n\tyou lose\n\t;(");
				}
			else if(str==2){
				System.out.println("you choose scissors");
				System.out.println("computer choose scissors \n\tDRAW\n\tTT");
				}
			break;
			default:
				System.out.println("invalid input");
			       i++;
				
		         }
			
		  }
               }

     }


