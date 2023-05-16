package baitap;

import java.util.Scanner;

public class bai14 {
	public static void main(String[] args) {


	Scanner vecTo = new Scanner(System.in);
	System.out.print("nhập vào tâm O:");
	int xO = vecTo.nextInt();
	int yO = vecTo.nextInt();
	
	System.out.println("tâm O :xO="+xO+"yO="+yO);
	System.out.println("nhập vào bán kính đường tròn:");
	int R=vecTo.nextInt();
	System.out.println("bán kính đường tròn là R="+R);
	System.out.print("nhập vào các điểm của tam giác :");
	int xA = vecTo.nextInt();
	int yA = vecTo.nextInt();
	int xB = vecTo.nextInt();
	int yB = vecTo.nextInt();
	int xC = vecTo.nextInt();
	int yC = vecTo.nextInt();
	
	System.out.println("\nxA=" + xA + "\nyA=" + yA + "\nxB=" + xB + "\nyB=" + yB + "\nxC=" + xC + "\nyC=" + yC);
	int xAB = (xB - xA);
	int yAB = (yB - yA);
	int xAC = (xC - xA);
	int yAC = (yC - yA);
	int xBC = (xC - xB);
	int yBC = (yC - yB);
	if (xAB * xAC == yAB * yAC)
		System.out.println("3 điểm không tạo thành tam giác");
	else {
		System.out.println("3 điểm tạo thành một tam giác");}
	double AB = Math.sqrt(Math.pow((xB - xA), 2) + Math.pow((yB - yA), 2));
	System.out.println("độ dài cạnh AB=" + AB);
	double AC = Math.sqrt(Math.pow((xC - xA), 2) + Math.pow((yC - yA), 2));
	System.out.println("độ dài cạnh AC=" + AC);
	double BC = Math.sqrt(Math.pow((xC - xB), 2) + Math.pow((yC - yB), 2));
	System.out.println("độ dài cạnh BC=" + BC);
	if (AB<=R&&AC<=R&&BC<=R) {
		System.out.println("True");
		}
	else System.out.println("False");
	
		
	}
}
