package lab2;

import java.util.Scanner;

public class bai5 {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner (System.in);
 int tong=0,n;
do {
	System.out.print("nhập số nguyên:");
	n=sc.nextInt();
	tong+=n;
		if (tong>100)
			
		break;
		
}while(n>0);
System.out.println(tong);
	}
}
