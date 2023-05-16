package bai3_3;

import java.util.Scanner;

public class hangDienMay extends hangHoa{
 private int thoiGianBaoHanh;
 int dienAp;
 int congSuat;
hangDienMay() {
	super();
	}
 public void nhaphdm() {
	 Scanner sc=new Scanner (System.in);
	 System.out.print("nhập thời gian bảo hành:");
	 thoiGianBaoHanh=sc.nextInt();
	 System.out.println("nhập điện áp:");
	 dienAp=sc.nextInt();
	 System.out.println("nhập công suất:");
	 congSuat=sc.nextInt();
 }
 public String toString () {
	 return "bảo hành:"+thoiGianBaoHanh+"\sđiện áp:"+dienAp+"\s công suất:"+congSuat;
 }
 public static void main(String[] args) {
	hangDienMay h=new hangDienMay();
	h.nhap();
	h.nhaphdm();
	System.out.println("*********thông tin sản phẩm:**********");
	h.xuat();
	System.out.println(h.toString());
}
}
