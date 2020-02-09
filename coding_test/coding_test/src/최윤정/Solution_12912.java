package cyj;
/*
 * �� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.
 * 
 * 
 * 
 * a�� b�� ���� ���� �� �� �ƹ� ���� �����ϼ���.
 * a�� b�� ��Ұ���� ���������� �ʽ��ϴ�. 
 */

class Solution_12912 {
	public long solution(int a, int b) {
		long result = 0;
		for(int i = Math.min(a, b);i<=Math.max(a,b);i++) {
			result += i;
		}
		return result;
	}

	public static void main(String[] args) {
		Solution_12912 s = new Solution_12912();
		System.out.println(s.solution(3, 5));
		System.out.println(s.solution(3, 3));
		System.out.println(s.solution(5, 3));
	}
}
