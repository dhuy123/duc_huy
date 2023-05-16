package baitap;

import java.util.Scanner;

public class bai10 {public static void main(String[] args) {
	Scanner vecTo= new Scanner(System.in);
	int xA=vecTo.nextInt();
	int yA=vecTo.nextInt();
	int xB=vecTo.nextInt();
	int yB=vecTo.nextInt();
	System.out.println("xA="+xA+" "+"yA="+yA+" "+"xB="+xB+" "+"yB="+yB);
	double AB=Math.sqrt(Math.pow((xB-xA),2)+Math.pow((yB-yA),2));
	System.out.println("độ dài cạnh Ab="+AB);
} 

}
