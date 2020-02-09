package �̵���;

// 
// 
// �ð����⵵ O(1)
/*
 * ������ ���� ���� 2020.02.09 19:57
 * ---------------------------
 * ���������� �� ���� �̿��� ���, �ð����⵵ O(1)
 * 1���� n������ ���� ���ϴ� ���� = (n + 1) * n / 2
 * ���� ���ڸ� a, ū ���ڸ� b ��� �������� �� a ���� b ���� ���ϴ� ����� ������ ����.
 * 1���� b ������ �տ��� 1���� a - 1 ������ ���� ����.
 * 
 * ex) a = 3, b = 5
 * aSum = 1 + 2
 * bSum = 1 + 2 + 3 + 4 + 5
 * �̹Ƿ� bSum ���� aSum�� ���� �츮�� ���ϴ� 3~5������ ���� ������ �ȴ�.
 * 
 * �̸� ����ȭ �ϸ� ������ ����.
 * aSum : 1���� a������ ��, bSum : 1���� b������ ��, result : �����
 * 
 * aSum = (a - 1 + 1) * (a - 1) / 2 = a * (a - 1) / 2
 * bSum = (b + 1) * b / 2
 * result 
 * > bSum - aSum
 * > ((b + 1) * b / 2) - (a * (a - 1) / 2)
 * > (((b + 1) * b) - (a * (a - 1))) / 2
 * > (b^2 + b - a^2 + a) / 2
 * > ((a + b)(a - b) + a + b) / 2
 * > (a + b)(a - b + 1) / 2
 * 
 * ���� ������ �ڵ�ȭ ��Ű�� �Ʒ��� �ڵ尡 ������ �ȴ�.
 */
public class solution_v2 {
	public static void main(String[] args) {
		System.out.println(solution(3, 5));
		System.out.println(solution(3, 3));
		System.out.println(solution(5, 3));
	}

	public static long solution(int a, int b) {
		long max = Math.max(a, b);
		long min = Math.min(a, b);
		return (max - min + 1) * (max + min) / 2;
	}
}