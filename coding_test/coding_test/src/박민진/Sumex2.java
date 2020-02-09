package 박민진;
/*
 * 유준혁 멘토 덧댐 2020.02.09 20:15
 * ---------------------------
 * 일반적인 방법.
 * 대소 구분이 없이 주어지므로 3가지의 예외처리를 하여 return하는 방식.
 * 1번의 방식과의 차이는 Integer.compare를 사용했다는 것.
 * 사실상 1번과 방식의 차이가 없으므로 1가지 코드로 쳐도 무방함.
 */
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