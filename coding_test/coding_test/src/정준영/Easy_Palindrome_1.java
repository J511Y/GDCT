package ���ؿ�;
/*
 * ������ ���� ���� 2020.02.09 20:22
 * ---------------------------
 * �Ϲ����� ���.
 * �Է¹��� ���ڿ��� ���� ���������� �ϳ��� Ȯ���غ��� ���.
 * check ��� boolean�� �ΰ� Ʋ���� �߰����� �� false�� ����.
 * ���������� �ش� boolean�� �����Ͽ� ����� ���.
 */
import java.util.Scanner;

public class Easy_Palindrome_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean check = true;
		String str = sc.next();
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt((str.length() - 1) - i)) check = false;
		}
		System.out.println(check ? 1 : 0);
	}
}
