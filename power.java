package dp;
import java.util.*;
public class power {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		int n=num;
		System.out.println("Enter the power:");
		int pow=s.nextInt();
		for(int i=2;i<=pow;i++){
			 n=n*num;
		}
		System.out.println(n);
	}

}
