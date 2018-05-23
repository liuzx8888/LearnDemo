package usualusedemo;

import java.util.Arrays;

public class ArraryDemo {
	

	
	public static void main(String[] args) {
		int  arr1[] = {1,4,5,67,7,8,9,9,4};
		System.out.println(Arrays.binarySearch(arr1, 4));
		Arrays.fill(arr1, 33);
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
	}
	
	

}
