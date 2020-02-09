package 박민진;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("단어를 입력하세요.");
		String input = scan.nextLine();
		String result = null;
		for (int i = 0; i < input.length() / 2; i++) {
			if (input.charAt(i) == input.charAt((input.length() - 1) - i)) {
				result = "1";
			} else {
				result = "0";
			}
		}
		System.out.println(result);

	}
}