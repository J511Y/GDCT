package �ڹ���;
/*
 * ������ ���� ���� 2020.02.09 20:14
 * ---------------------------
 * �Ϲ����� ���.
 * ��� ������ ���� �־����Ƿ� 3������ ����ó���� �Ͽ� return�ϴ� ���.
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