package bai3_2;

import java.util.Scanner;

public class main {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int lc;
	System.out.println("\slựa chọn:");
	System.out.println("1:ĐIỂM.");
	System.out.println("2:TAM GIÁC.");
	System.out.println("3: ĐƯỜNG TRÒN");
	lc=sc.nextInt();
	switch (lc){
		case 1:
			diem d=new diem(0,0);
			d.nhapDiem();
			d.inDiem();
			break;
		case 2:
			tamGiac t=new tamGiac(0,0);
			t.nhapTG();
			t.inTamGiac();
			if (t.kiemtra()){
				System.out.println("3 điểm tạo thành tam giác");
				t.chuvi();
				t.dientich();	
			}
				else System.out.println("3 điểm ko tạo thanh tam giác");
			break;
			
		case 3:
		duongtron c=new duongtron(0,0);
		c.nhapdt();
		c.nhapDiem();
		c.indt();
		c.inDiem();
		c.chuvi();
		c.dientich();
		
		}

}}
