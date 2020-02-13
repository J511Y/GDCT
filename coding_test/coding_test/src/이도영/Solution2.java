package �̵���;
/*
 * ������ ���� ���� 2020.02.09 20:44
 * ---------------------------
 * Map Collection Ȱ���Ͽ� ���ϴ� ���.
 * Map.getOrDefault() �޼��带 �𸣴µ�..?
 */

import java.util.HashMap;

public class Solution2 {

	public static void main(String[] args) {
		String input[] = { "b", "a", "c", "d", "a" };
		String test[] = { "b", "a", "d", "c" };
		System.out.println(solution(input, test));
	}

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String p : participant) {
			if (map.containsKey(p) == true)
				map.put(p, map.get(p) + 1);
			else
				map.put(p, 1);
		}

		for (String c : completion)
			map.put(c, map.get(c) - 1);
		for (String p : participant) {
			if (map.get(p) != 0)
				answer = p;
		}

		return answer;
	}

}