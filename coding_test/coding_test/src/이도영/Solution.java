package 이도영;
/*
 * 유준혁 멘토 덧댐 2020.02.09 20:40
 * ---------------------------
 * Arrays 클래스 활용하여 두 배열을 각각 정렬 후 비교하는 방식.
 * 여기선 반복문 내에서의 조건문이 어떻게 돌아가는지 알고있는 것 같은데
 * 두 정수 사이의 합 문제에서의 Math.max는 그냥 숏코딩하려고 쓴 듯
 */

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		String input[] = { "b", "a", "c", "d", "a" };
		String test[] = { "b", "a", "d", "c" };
		System.out.println(solution(input, test));
	}

	public static String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		int i;
		for (i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
		return participant[i];
	}
}
