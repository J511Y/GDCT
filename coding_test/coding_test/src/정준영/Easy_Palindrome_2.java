package ���ؿ�;
/*
 * ������ ���� ���� 2020.02.09 20:16
 * ---------------------------
 * �Ϲ����� ���.
 * �Է¹��� ���ڿ��� ���� ���������� �ϳ��� Ȯ���غ��� ���.
 * 
 * ����� ��Ʈ���� �ݺ��� ���� (for -> while) �ߴٴ� �� �ܿ��� �ٸ� ���� �����Ƿ� �� ���� Ǯ�̷� �з�
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Easy_Palindrome_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		Boolean check = true;
		String str = br.readLine();
		while (true) {
			if (cnt == (str.length() / 2)) break;
			if (str.charAt(cnt) != str.charAt((str.length() - 1) - cnt)) check = false;
			cnt++;
		}
		if(check) System.out.println(1);
	    else System.out.println(0);
	}
}
