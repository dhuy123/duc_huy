package lab2;

import java.util.Scanner;

public class bai8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n;
		double tbc=0;
		System.out.println("nhập số phần tử");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("nhập giá trị mảng");
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			System.out.println("a["+i+"]="+a[i]);
			tbc+=a[i];
		}
		System.out.println(tbc/n);
		
			
	}

}
