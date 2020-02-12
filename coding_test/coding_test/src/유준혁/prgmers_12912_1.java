package ������;
/*
 * https://programmers.co.kr/learn/courses/30/lessons/12912
 * �� ���� ������ ��
 * ----------------
 * ��͸� ����� ��� + 3���� ��� ó���ϴ� �Ϲ����� ���
 */
public class prgmers_12912_1 {
	static private long solution(int a, int b) {
		if(a == b) return a;
		if(a > b) return solution(b, a);
		
		long sum = 0;
		while(a <= b) sum += a++;
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(solution(3, 5));
		System.out.println(solution(5, 3));
		System.out.println(solution(3, 3));
	}
}
