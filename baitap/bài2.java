package baitap;
import java.util.Scanner;

public class bài2 {

	public static void main(String[] args) {
		Scanner ss =new Scanner(System.in);
		System.out.print("nhập số nguyên a:");
		int a=ss.nextInt();
		System.out.print("nhập số nguyên b:");
		int b=ss.nextInt();
		if(a>b)
			System.out.println(a+">"+b);
		 else if(a<b)
			System.out.println(a+">"+b);
		  else System.out.println(a+"="+b);
		
	 
	
	}
}
