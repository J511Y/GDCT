package �̵���;
/*
 * ������ ���� ���� 2020.02.09 20:14
 * ---------------------------
 * �Ϲ����� ���.
 * �Է����� ���� ���ڿ��� �� ���������� �ϳ��� Ȯ���ϴ� ���.
 * 
 * Ư���� : new Scanner(System.in) ���. check = false �� break;
 */
import java.util.*;
public class Palindrome_v1 {
	public static void main(String[] args) {
		String input = new Scanner(System.in).next();
		boolean check = true;

		for (int i = 0; i < input.length() / 2; i++) {
			if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
				check = false;
				break;
			}
		}
		System.out.println(check == true ? "1" : "0");
	}
}
