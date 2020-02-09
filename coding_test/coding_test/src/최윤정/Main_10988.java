package 최윤정;

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

/*
 * 유준혁 멘토 덧댐 2020.02.09 23:43
 * ---------------------------
 * StringBuffer/Builder의 reverse 메서드를 직접 구현한 방법
 * reverse 메서드의 내부적인 구현 역시 이와 비슷한 방식으로 이루어져있다.
 * (기존 string -> stringBuilder 이동 후 toString은 아니긴 함.)
 * (배열로 가지고 있는 값들을 switch 시키는 것 뿐임)
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
