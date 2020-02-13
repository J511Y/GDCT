package 이도영;
/*
 * 유준혁 멘토 덧댐 2020.02.09 20:38
 * ---------------------------
 * 입력받은 문자열을 reverse하여 비교하는 방법.
 */
import java.io.IOException;
import java.util.Scanner;

public class Palindrome_v2 {
	public static void main(String[] args) throws IOException {
		String input = new Scanner(System.in).next();
		String reverse = new StringBuilder(input).reverse().toString();

		System.out.println((input.equals(reverse)) ? "1" : "0");
	}
}