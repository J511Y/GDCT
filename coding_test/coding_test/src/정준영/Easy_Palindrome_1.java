package 정준영;
/*
 * 유준혁 멘토 덧댐 2020.02.09 20:22
 * ---------------------------
 * 일반적인 방법.
 * 입력받은 문자열의 양쪽 끝에서부터 하나씩 확인해보는 방식.
 * check 라는 boolean을 두고 틀린걸 발견했을 시 false로 만듦.
 * 마지막으로 해당 boolean을 참조하여 결과값 출력.
 */
import java.util.Scanner;

public class Easy_Palindrome_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean check = true;
		String str = sc.next();
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt((str.length() - 1) - i)) check = false;
		}
		System.out.println(check ? 1 : 0);
	}
}