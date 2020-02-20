package 최윤정;
//정렬_K번째수
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution_42748 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			List<Integer> list = new LinkedList<Integer>();
			for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
				list.add(array[j]);
			}
			Collections.sort(list);
			System.out.println(list);
			answer[i] = list.get(commands[i][2] - 1);
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		int[] answer = new Solution_42748().solution(array, commands);
		for (int i : answer) {
			System.out.println(i);
		}
	}
}
