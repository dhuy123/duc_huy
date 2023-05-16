package baitaplan2;

public class bai8 {
	public class bai7 {
		String str = "leDaoTanThanh";
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				result = result + "_" + (char)(str.charAt(i) + 32);
			}else {
				result = result + str.charAt(i);
			}
		}
		System.out.println(result);
}
