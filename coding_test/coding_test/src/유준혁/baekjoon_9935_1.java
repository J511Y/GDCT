package ������;
/*
 * https://www.acmicpc.net/problem/9935
 * ���� ���ڿ�����
 * ------------------------
 * String.replace()�޼��� ����� / ���� �� �ð��ʰ� �� ��
 * �־��� ��� 50���� Replace �޼��� ȣ��. �޸𸮵� �ʰ����ڴ�
 */
import java.util.*;
public class baekjoon_9935_1 {
	public static void main(String[] args) {
		String s = new Scanner(System.in).next();
		String boom = new Scanner(System.in).next();
		while(s.indexOf(boom) != -1) s = s.replace(boom, "");
		System.out.println(s);
	}
}
