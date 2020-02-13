package ±Ë∞Ê≈√;

import java.util.Scanner;

public class Betweentotal_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int total = 0;
		if (a < b) {
			for (int i = a; i <= b; i++) {
				total += i;
			}
		} else {
			for (int i = b; i <= a; i++) {
				total += i;
			}
		}

		System.out.println(total);
	}

}
