package bai3_3;

import java.util.Scanner;

public class hangHoa {
	private String maHang;
	String tenHang;
	String nhaSanXuat;
	double gia;

	public void nhap() {
		Scanner sc=new Scanner (System.in);
		System.out.print("nhap ma hang ");
		maHang=sc.next();
		sc.nextLine();
		System.out.print("nhap ten Hang ");
		tenHang=sc.nextLine();
	    System.out.print("nhap nha san xuat ");
		nhaSanXuat=sc.nextLine();
		System.out.print("nhap gia  ");
	    gia =sc.nextInt();
	    
	}
	public void xuat(){
		
	System.out.println(maHang+"\t"+tenHang+"\t"+nhaSanXuat+"\t"+gia);
		
	}
}
