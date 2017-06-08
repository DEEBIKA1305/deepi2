package dp;
import java.util.*;
public class primenumber{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int num,count=0;
	System.out.println("Enter the number:");
	num=s.nextInt();
	for(int i=1;i<=num;i++){
		if(num%i==0){
			count++;
		}
		}
	if(count==2){
		System.out.println(num+"is a prime number");
	}
	else
	{
		System.out.println(num+"is not a prime number");
	}
}
}
