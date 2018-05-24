package iodemo;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		scanner.useDelimiter("\n");
		String str = scanner.next();
		System.out.println(str);
	}

}
