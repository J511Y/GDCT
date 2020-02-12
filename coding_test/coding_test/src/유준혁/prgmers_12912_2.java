package ������;
/*
 * https://programmers.co.kr/learn/courses/30/lessons/12912
 * �� ���� ������ ��
 * ----------------
 * ��ͷθ� Ǫ�� ��� / ���� �� ���ÿ����÷ο�߻�
 */
public class prgmers_12912_2 {

	static private long solution(int a, int b) {
		return func(Math.min(a, b), Math.max(a, b), 0);
	}
	static private long func(int a, int b, long sum) {
		if(a == b) return sum + a;
		return func(a + 1, b, sum + a);
	}
	public static void main(String[] args) {
		System.out.println(solution(3, 5));
		System.out.println(solution(5, 3));
		System.out.println(solution(3, 3));
	}
}
