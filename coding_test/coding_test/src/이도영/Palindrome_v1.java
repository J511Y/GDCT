package 이도영;
/*
 * 유준혁 멘토 덧댐 2020.02.09 20:14
 * ---------------------------
 * 일반적인 방법.
 * 입력으로 들어온 문자열의 양 끝에서부터 하나씩 확인하는 방법.
 * 
 * 특이점 : new Scanner(System.in) 사용. check = false 시 break;
 */
import java.util.*;
public class Palindrome_v1 {
	public static void main(String[] args) {
		String input = new Scanner(System.in).next();
		boolean check = true;

		for (int i = 0; i < input.length() / 2; i++) {
			if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
				check = false;
				break;
			}
		}
		System.out.println(check == true ? "1" : "0");
	}
}
