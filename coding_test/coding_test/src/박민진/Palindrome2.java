package �ڹ���;
/*
 * ������ ���� ���� 2020.02.09 20:20
 * ---------------------------
 * StringBuffer�� reverse �޼��带 ����ϴ� ���
 * �Է¹��� ���ڿ��� reverse �Ͽ� ���� ���� ���ϰ� �ִ��� Ȯ���ϸ� �Ӹ�������� �� �� ����.
 */
import java.util.Scanner;

public class Palindrome2 {
	public static void main(String[] args) {
		System.out.println("�ܾ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		StringBuffer sb = new StringBuffer(input);

		if (input.equals(sb.reverse().toString())) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}