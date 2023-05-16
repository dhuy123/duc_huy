package baitap;

import java.util.Scanner;

public class bai12 {
	public static void main(String[] args) {

		Scanner vecTo = new Scanner(System.in);
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
			System.out.println("3 điểm tạo thành một tam giác");
			double AB = Math.sqrt(Math.pow((xB - xA), 2) + Math.pow((yB - yA), 2));
			System.out.println("độ dài cạnh AB=" + AB);
			double AC = Math.sqrt(Math.pow((xC - xA), 2) + Math.pow((yC - yA), 2));
			System.out.println("độ dài cạnh AC=" + AC);
			double BC = Math.sqrt(Math.pow((xC - xB), 2) + Math.pow((yC - yB), 2));
			System.out.println("độ dài cạnh BC=" + BC);
			double chuVi=AB+AC+BC;
			System.out.println("Chuvi="+chuVi);
			double p=(AB+AC+BC)/2;
			double S=Math.sqrt(p*(p-AB)*(p-AC)*(p-BC));
			System.out.println("s="+S);
			
			;
		}

	}
}