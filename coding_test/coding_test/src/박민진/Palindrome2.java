package 박민진;
/*
 * 유준혁 멘토 덧댐 2020.02.09 20:20
 * ---------------------------
 * StringBuffer의 reverse 메서드를 사용하는 방법
 * 입력받은 문자열을 reverse 하여 같은 값을 지니고 있는지 확인하면 팰린드롬인지 알 수 있음.
 */
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