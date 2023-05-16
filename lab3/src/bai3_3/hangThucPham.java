package bai3_3;

import java.util.Scanner;

public class hangThucPham extends hangHoa {
private hangHoa hangThucPham;
int ngaySanXuat;
String ngayHetHan;
public hangThucPham() {
	super();
	}
public void nhaptp() {
	Scanner sc=new Scanner (System.in);
	System.out.println("nhập ngày sản xuất:");
	ngaySanXuat=sc.nextInt();
	System.out.println("nhập ngày hết hạn:");
	ngayHetHan=sc.nextLine();
	}
public String toString() {
	return "ngày Sản Xuất:"+ngaySanXuat + "\n "+"ngày hết hạn:"+ngayHetHan;
	
}
	



}
