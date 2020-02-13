package 유준혁;
/*
 * https://www.acmicpc.net/problem/10988
 * 팰린드롬인지 확인하기
 * ----------------
 * 문자열의 양끝에서부터 확인해보는 방법
 * 시간복잡도 O(N) / N = 문자열의 길이
 */

public class baekjoon_10988_2 {
	public static void main(String[] args) {
		byte[] arr = new java.util.Scanner(System.in).next().getBytes();
		int len = arr.length;
		for(int i = 0; i < len / 2; i++) {
			if(arr[i] != arr[len - i - 1]) {
				System.out.println(0);
				return;
			}
		}
		System.out.println(1);
	}
}
