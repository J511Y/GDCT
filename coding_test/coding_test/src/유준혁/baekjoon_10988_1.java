package ������;
/*
 * https://www.acmicpc.net/problem/10988
 * �Ӹ�������� Ȯ���ϱ�
 * ----------------
 * StringBuffer(Builder)�� reverse �޼��� ����ϴ� ���
 * �ð����⵵O(N) / N = ���ڿ��� ����
 */
import java.util.*;
public class baekjoon_10988_1 {
	public static void main(String[] args) {
		String a = new Scanner(System.in).next();
		String b = new StringBuffer(a).reverse().toString();
		System.out.println(a.equals(b) ? 1 : 0);
	}
}
