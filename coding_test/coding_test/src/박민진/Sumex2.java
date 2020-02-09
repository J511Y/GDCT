package �ڹ���;
/*
 * ������ ���� ���� 2020.02.09 20:15
 * ---------------------------
 * �Ϲ����� ���.
 * ��� ������ ���� �־����Ƿ� 3������ ����ó���� �Ͽ� return�ϴ� ���.
 * 1���� ��İ��� ���̴� Integer.compare�� ����ߴٴ� ��.
 * ��ǻ� 1���� ����� ���̰� �����Ƿ� 1���� �ڵ�� �ĵ� ������.
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