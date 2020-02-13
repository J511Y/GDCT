package ±Ë∞Ê≈√;

import java.util.Scanner;

public class Main_10988_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String intext = scan.nextLine();
		int result = 0;
		
		for (int j = 0; j < intext.length(); j++) {
			if (intext.charAt(j) == (intext.charAt(intext.length() - 1 - j))) {
				result = 1;
			} else {
				result = 0;
				break;
			}
		}
		System.out.println(result);

	}
}