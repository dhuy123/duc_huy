package bai3_2;

import java.util.Scanner;

public class duongtron extends diem {
 diem o;
int r;
	duongtron(int x, int y) {
		super(x, y);
		}
	public void nhapdt() {
		Scanner sc= new Scanner (System.in);
		System.out.println("nhập bán kính");
		r=sc.nextInt();
		System.out.println("nhập tọa đọ tâm O:");
		
	}public void indt(){
		System.out.println("bán kính đường tròn "+r);
		System.out.println("tạo dộ tâm O:");
	}
	public void chuvi() {
		double chuvi=0;
		System.out.println("chuvi="+(2*3.14*r));
	}
	public void dientich() {
		double dientich=0;
		System.out.println("dientich="+(r*r*3.14));
	}

}
