package cyj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * level, noon�� �Ӹ�����̰�, baekjoon, online, judge�� �Ӹ������ �ƴϴ�.
 * 
 * ù° �ٿ� �ܾ �־�����. �ܾ��� ���̴� 1���� ũ�ų� ����, 100���� �۰ų� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
 * 
 * ù° �ٿ� �Ӹ�����̸� 1, �ƴϸ� 0�� ����Ѵ�.
 */


// ��� 1
public class Main_10988 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String word = br.readLine();
		int len = word.length()-1;
		for(int i= len; i>=0; i--) {
			sb.append(word.charAt(i));
		}
		if(word.equals(sb.toString())) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}
