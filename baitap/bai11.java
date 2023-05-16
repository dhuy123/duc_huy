package baitap;

import java.util.Scanner;

public class bai11 {
public static void main(String[] args) {
	Scanner vecTo= new Scanner(System.in);
	int xA=vecTo.nextInt();
	int yA=vecTo.nextInt();
	int xB=vecTo.nextInt();
	int yB=vecTo.nextInt();
	double a=(yB-yA)/(xB-xA);
	double b=yA-a*xA;
	System.out.println("y="+a+"x"+b);
	
}
}
