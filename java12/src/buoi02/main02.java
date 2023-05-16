package buoi02;

public class main02 {
	public static void main(String[] args) {
//	int a=25;//11001
//	a=a<<2;//1100100
//	int a=25;//11001
//	a=a>>2;//110
//	System.out.println(a);
//	
		Integer a=10;
		Integer b=10;
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		//trả ra cùng địa chỉ ô nhớ
		Integer c=new Integer(10);
		Integer d=new Integer(10);
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		//trả ra khác địa chỉ ô nhớ 
	}

}
