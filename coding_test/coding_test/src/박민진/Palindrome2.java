package 박민진;

import java.util.Scanner;

public class Palindrome2 {
	public static void main(String[] args) {
		System.out.println("단어를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		StringBuffer sb = new StringBuffer(input);

		if (input.equals(sb.reverse().toString())) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}