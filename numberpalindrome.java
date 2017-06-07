package dp;
import java.util.*;
public class numberpalindrome {
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=s.nextInt();
	int n=num;
	int rev=0;
	while(num>0){
		n=num%10;
		 rev=(rev*10)+n;
		 num=num/10;
	}
	System.out.println("Palindrome of anumber is"+rev);
}
}
