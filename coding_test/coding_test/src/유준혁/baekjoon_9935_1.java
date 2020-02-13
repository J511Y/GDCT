package 유준혁;
/*
 * https://www.acmicpc.net/problem/9935
 * 백준 문자열폭발
 * ------------------------
 * String.replace()메서드 사용방법 / 제출 시 시간초과 날 듯
 * 최악의 경우 50만번 Replace 메서드 호출. 메모리도 초과나겠다
 */
import java.util.*;
public class baekjoon_9935_1 {
	public static void main(String[] args) {
		String s = new Scanner(System.in).next();
		String boom = new Scanner(System.in).next();
		while(s.indexOf(boom) != -1) s = s.replace(boom, "");
		System.out.println(s);
	}
}
