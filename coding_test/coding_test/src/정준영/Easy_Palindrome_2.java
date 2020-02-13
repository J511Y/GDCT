package 정준영;
/*
 * 유준혁 멘토 덧댐 2020.02.09 20:16
 * ---------------------------
 * 일반적인 방법.
 * 입력받은 문자열의 양쪽 끝에서부터 하나씩 확인해보는 방식.
 * 
 * 입출력 스트림과 반복문 변경 (for -> while) 했다는 것 외에는 다른 점이 없으므로 한 가지 풀이로 분류
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
