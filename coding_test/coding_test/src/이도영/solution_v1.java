package 이도영;
/*
 * 유준혁 멘토 덧댐 2020.02.09 20:10
 * ---------------------------
 * 일반적인 방법.
 * 코드의 양을 줄이기 위해 조건문 안에 바로 값을 집어넣은 걸로 보임.
 * 다만 조건을 계산할때 어떤식으로 이루어지는지 한 번 확인 필요.
 */
public class solution_v1 {
	public static void main(String[] args) {
		System.out.println(solution(3, 5));
		System.out.println(solution(3, 3));
		System.out.println(solution(5, 3));
	}

	public static long solution(int a, int b) {
		long answer = 0;
		for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
			answer += i;
		}
		return answer;
	}
}
