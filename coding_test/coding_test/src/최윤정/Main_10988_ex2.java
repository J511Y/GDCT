package cyj;

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
