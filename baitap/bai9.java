package baitap;

import java.util.Scanner;

public class bai9 {public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("nhập vào 2 số nguyên dương a b:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("a="+a+"b="+b);
	int phanDu=a-b*(a/b);
	System.out.println("phần dư của a chia b là :"+phanDu);
	
    
	
}

}
