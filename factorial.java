package dp;
import java.util.*;
public class factorial {
public static void main(String args[]){
	int num;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number:");
	num=s.nextInt();
	for(int i=num-1;i>=1;i--){
		 num=num*i;
	}
	System.out.println("Factorial of a number is:"+num);
}
}
