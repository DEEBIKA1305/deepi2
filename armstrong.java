package dp;
import java.util.*;
public class armstrong {
 public static void main(String args[]){
Scanner s=new Scanner(System.in);
int num,count=0,r=0;
System.out.println("Enter any  number:");
num=s.nextInt();
int c=num;
while(c>0){
	 int n=c%10;
	 r=r+(n*n*n);
	 c=c/10;
	}
if(r==num){
System.out.println(num+"is an armstrong number");
}
else{
	System.out.println(num+"is not an armstrong number");
	}
}}

