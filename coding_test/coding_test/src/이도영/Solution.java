package �̵���;
/*
 * ������ ���� ���� 2020.02.09 20:40
 * ---------------------------
 * Arrays Ŭ���� Ȱ���Ͽ� �� �迭�� ���� ���� �� ���ϴ� ���.
 * ���⼱ �ݺ��� �������� ���ǹ��� ��� ���ư����� �˰��ִ� �� ������
 * �� ���� ������ �� ���������� Math.max�� �׳� ���ڵ��Ϸ��� �� ��
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
