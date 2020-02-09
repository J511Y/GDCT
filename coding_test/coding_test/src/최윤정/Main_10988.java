package cyj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.
 * 
 * 첫째 줄에 단어가 주어진다. 단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.
 * 
 * 첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.
 */


// 방식 1
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
