package �̵���;
/*
 * ������ ���� ���� 2020.02.09 20:10
 * ---------------------------
 * �Ϲ����� ���.
 * �ڵ��� ���� ���̱� ���� ���ǹ� �ȿ� �ٷ� ���� ������� �ɷ� ����.
 * �ٸ� ������ ����Ҷ� ������� �̷�������� �� �� Ȯ�� �ʿ�.
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
