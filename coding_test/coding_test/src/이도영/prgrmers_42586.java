package ÀÌµµ¿µ;

import java.util.*;

public class prgrmers_42586 {
	public int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < progresses.length; i++) {
			queue.add((100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i]
					: (100 - progresses[i]) / speeds[i] + 1);
		}
		List<Integer> result = new ArrayList<>();
		int standard = queue.poll();
		int cnt = 1;
		while (!queue.isEmpty()) {
			int num = queue.poll();
			if (standard >= num) {
				cnt++;
			} else {
				result.add(cnt);
				cnt = 1;
				standard = num;
			}
		}
		result.add(cnt);
		int[] answer = new int[result.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = result.get(i);
		}
		return answer;
	}

}
