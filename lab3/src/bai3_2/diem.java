package bai3_2;

import java.util.Scanner;

public class diem {
	public int x;
	int y;

	diem(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập tọa độ x");
		this.x = sc.nextInt();
		System.out.println("nhập tọa độ y");
		this.y = sc.nextInt();
	}
	public void inDiem() {
		System.out.println("(x,y)=("+this.x+","+this.y+")");
	}

}
