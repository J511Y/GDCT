package ������;
/*
 * https://www.acmicpc.net/problem/10988
 * �Ӹ�������� Ȯ���ϱ�
 * ----------------
 * ���ڿ��� �糡�������� Ȯ���غ��� ���
 * �ð����⵵ O(N) / N = ���ڿ��� ����
 */

public class baekjoon_10988_2 {
	public static void main(String[] args) {
		byte[] arr = new java.util.Scanner(System.in).next().getBytes();
		int len = arr.length;
		for(int i = 0; i < len / 2; i++) {
			if(arr[i] != arr[len - i - 1]) {
				System.out.println(0);
				return;
			}
		}
		System.out.println(1);
	}
}
