package �̵���;
/*
 * ������ ���� ���� 2020.02.09 20:38
 * ---------------------------
 * �Է¹��� ���ڿ��� reverse�Ͽ� ���ϴ� ���.
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