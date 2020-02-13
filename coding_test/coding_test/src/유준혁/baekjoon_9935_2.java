package ������;
/*
 * https://www.acmicpc.net/problem/9935
 * ���� ���ڿ�����
 * ------------------------
 * Stack ���� (LIFO) ��� ���
 * �ð����⵵ O(N) / N = ���ڿ��� ����
 */
import java.util.*;
public class baekjoon_9935_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(), boom = sc.next();
		int len = boom.length();
		int sbLen = 0;
		StringBuffer sb = new StringBuffer();
		for(char c : s.toCharArray()) {
			sb.append(c);
			sbLen++;
			if(sbLen >= len) {
				String last = sb.substring(sbLen - len);
				if(last.equals(boom)) {
					sb.delete(sbLen - len, sbLen);
					sbLen -= len;
				}
			}
		}
		s = sb.toString();
		System.out.println(s.equals("") ? "FRULA" : s);
	}
}
