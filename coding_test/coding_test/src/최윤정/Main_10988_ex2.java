package 최윤정;
/*
 * 유준혁 멘토 덧댐 2020.02.09 23:43
 * ---------------------------
 * StringBuffer/Builder의 reverse 메서드를 직접 구현한 방법
 * reverse 메서드의 내부적인 구현 역시 이와 비슷한 방식으로 이루어져있다.
 * (기존 string -> stringBuilder 이동 후 toString은 아니긴 함.)
 * (배열로 가지고 있는 값들을 switch 시키는 것 뿐임)
 * 
 * 이번엔 Stack 사용 버전
 * Stack의 LIFO 특성을 사용했다고 보여짐.
 * 다른 자료구조로 접근한건 좋았으나 큰 틀에서 보면 결국 같은 맥락이기에 한 가지의 풀이로 분류.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_10988_ex2 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> st = new Stack<Character>();
		String word = br.readLine();
		String reverseword = "";
		char[] words = word.toCharArray();
		int len = words.length;
		
		if(len>=1 || len <100) {
			for(int i=0;i<len;i++) {
				st.add(words[i]);
			}
			for (int i = 0; i < len; i++) {
				reverseword += st.pop();
			}
			
			System.out.println((word.equals(reverseword))?1:0);
		}
	}
}
