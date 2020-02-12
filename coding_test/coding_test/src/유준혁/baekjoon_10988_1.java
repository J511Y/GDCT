package 유준혁;
/*
 * https://www.acmicpc.net/problem/10988
 * 팰린드롬인지 확인하기
 * ----------------
 * StringBuffer(Builder)의 reverse 메서드 사용하는 방법
 * 시간복잡도O(N) / N = 문자열의 길이
 */
import java.util.*;
public class baekjoon_10988_1 {
	public static void main(String[] args) {
		String a = new Scanner(System.in).next();
		String b = new StringBuffer(a).reverse().toString();
		System.out.println(a.equals(b) ? 1 : 0);
	}
}
