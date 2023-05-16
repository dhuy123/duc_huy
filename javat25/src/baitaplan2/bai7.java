public class bai7 {
	
public static void main(String[] args) {
	
}
int[] arr = new int[] {4, 2, 6, 1, 2, 4, 9};
		int min = arr[0];
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		for(int i = min + 1; i < max; i++) {
			boolean exist = false;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] == i) {
				exist = true;
				break;
				}
			}
		if(!exist) {
				System.out.println(i);
			}
		}
		


public class bai7 {

}
