package 박민진;
/*
 * 유준혁 멘토 덧댐 2020.02.09 20:16
 * ---------------------------
 * 일반적인 방법.
 * 입력받은 문자열의 양쪽 끝에서부터 하나씩 확인해보는 방식.
 * 다만 result가 0이 되었을때는 0을 출력하고 종료해야 함.
 * 
 * 반례
 * 입력 : abccca
 * 출력 : 0
 * 정답 : 1
 */
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
	
	// 유준혁 멘토 변경 코드
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("단어를 입력하세요.");
//		String input = scan.nextLine();
//		for (int i = 0; i < input.length() / 2; i++) {
//			if (input.charAt(i) != input.charAt((input.length() - 1) - i)) {
//				System.out.println(0);
//				return;
//			}
//		}
//		System.out.println(1);
//	}
}