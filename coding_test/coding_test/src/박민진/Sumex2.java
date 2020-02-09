package ¹Ú¹ÎÁø;

public class Sumex2 {
	static long solution(int a, int b) {
		long answer = 0;
		if (Integer.compare(a, b) == 1) {
			for (int i = b; i <= a; i++) {
				answer += i;
			}
		} else if (Integer.compare(a, b) == -1) {
			for (int i = a; i <= b; i++) {
				answer += i;
			}
		} else {
			answer = a;
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(5, 10));
		System.out.println(solution(10, 10));
		System.out.println(solution(10, 1));
	}
}