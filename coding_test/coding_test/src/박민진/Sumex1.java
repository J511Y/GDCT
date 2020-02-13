package 박민진;
/*
 * 유준혁 멘토 덧댐 2020.02.09 20:14
 * ---------------------------
 * 일반적인 방법.
 * 대소 구분이 없이 주어지므로 3가지의 예외처리를 하여 return하는 방식.
 */
public class Sumex1 {
	static long solution(int a, int b) {
		long answer = 0;
		if (a > b) {
			for (int i = b; i <= a; i++) {
				answer += i;
			}
		} else if (b > a) {
			for (int i = a; i <= b; i++) {
				answer += i;
			}
		} else {
			answer = a;
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(1, 10));
		System.out.println(solution(10, 10));
		System.out.println(solution(10, 1));
	}
}