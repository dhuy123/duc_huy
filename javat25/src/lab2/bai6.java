package lab2;

import java.util.Scanner;

public class bai6 {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n,giaithua=1;
	System.out.print("nhập số nguyên n:");
	n=sc.nextInt();
	for (int i=2;i<=n;i++) {
		if(n==0||n==1)
			System.out.print(n);
		else 
		giaithua*=i;}
		System.out.println("giaithua của"+n+"="+giaithua);
	
		
}
}
