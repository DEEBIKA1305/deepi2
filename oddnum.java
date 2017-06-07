package dp;
import java.util.*;
public class oddnum {
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the 1st interval:");
	int f=s.nextInt();
	System.out.println("Enter the 2nd interval");
	int l=s.nextInt();
	for(int i=f;i<=l;i++){
		if(i%2!=0){
			System.out.println(i);
		}
	}
}
}
