package �ڹ���;
/*
 * ������ ���� ���� 2020.02.09 20:16
 * ---------------------------
 * �Ϲ����� ���.
 * �Է¹��� ���ڿ��� ���� ���������� �ϳ��� Ȯ���غ��� ���.
 * �ٸ� result�� 0�� �Ǿ������� 0�� ����ϰ� �����ؾ� ��.
 * 
 * �ݷ�
 * �Է� : abccca
 * ��� : 0
 * ���� : 1
 */
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ܾ �Է��ϼ���.");
		String input = scan.nextLine();
		String result = null;
		for (int i = 0; i < input.length() / 2; i++) {
			if (input.charAt(i) == input.charAt((input.length() - 1) - i)) {
				result = "1";
			} else {
				result = "0";
			}
		}
		System.out.println(result);

	}
	
	// ������ ���� ���� �ڵ�
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�ܾ �Է��ϼ���.");
//		String input = scan.nextLine();
//		for (int i = 0; i < input.length() / 2; i++) {
//			if (input.charAt(i) != input.charAt((input.length() - 1) - i)) {
//				System.out.println(0);
//				return;
//			}
//		}
//		System.out.println(1);
//	}
}