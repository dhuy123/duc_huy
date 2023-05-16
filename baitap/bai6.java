package baitap;

import java.util.Scanner;

public class bai6 {
	public static void main(String[] args) {
		Scanner sn=new Scanner (System.in);
		System.out.println("nhap 3 so nguyen :");
		int a=sn.nextInt();
		System.out.println("số nguyên a là :");
		int b=sn.nextInt();
		System.out.println("số nguyên b là :");
		int c=sn.nextInt();
		System.out.println("số nguyên c là:");
		if (a>b){
		 System.out.println("a là so lon nhat trong 3 số:"+a);}
		 else if (b>c) {
			 System.out.println("b là số lớn nhất trong 3 số:"+b);
			 		 }
		else { System.out.println("c là số lớn nhất trong 3 số: "+c);}
		
			 
		
		
		
		
	}

}
