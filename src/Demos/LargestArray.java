package Demos;

public class LargestArray {

	public static void main(String[] args) {
		int [] arr = {1,2,4,5,9,5,4,0};
		int max = arr[0];
		for (int i:arr) {
			if(i>max) {
				max=i;
			}
		}
		System.out.println(max);

	}

}
