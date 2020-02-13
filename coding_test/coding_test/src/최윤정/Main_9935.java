package 최윤정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 상근이는 문자열에 폭발 문자열을 심어 놓았다. 
 * 폭발 문자열이 폭발하면 그 문자는 문자열에서 사라지며, 
 * 남은 문자열은 합쳐지게 된다.
 * 
 * 문자열이 폭발 문자열을 포함하고 있는 경우에, 모든 폭발 문자열이 폭발하게 된다. 
 * 남은 문자열을 순서대로 이어 붙여 새로운 문자열을 만든다.
 * 새로 생긴 문자열에 폭발 문자열이 포함되어 있을 수도 있다.
 * 폭발은 폭발 문자열이 문자열에 없을 때까지 계속된다.
 * 
 * 남아있는 문자가 없는 경우가 있다. 이때는 "FRULA"를 출력
 * 폭발 문자열은 같은 문자를 두 개 이상 포함하지 않는다.
 * 
 * 첫째 줄에 문자열이 주어진다. 문자열의 길이는 1보다 크거나 같고, 1,000,000보다 작거나 같다.
 * 둘째 줄에 폭발 문자열이 주어진다. 길이는 1보다 크거나 같고, 36보다 작거나 같다.
 * 두 문자열은 모두 알파벳 소문자와 대문자, 숫자 0, 1, ..., 9로만 이루어져 있다.
 * 
 * 첫째 줄에 모든 폭발이 끝난 후 남은 문자열을 출력한다.
 */

/*
 * 유준혁 멘토 덧댐 2020.02.09 23:53
 * ---------------------------
 * 아마도 String.Replace를 직접 구현하고자 한 것 처럼 보임
 * 최악의 경우를 상정하는 연습이 필요해보임.
 * 100만 자리의 문자열이 들어오고, 가운데서 부터 연쇄 폭발로 모든 문자열이 사라진다고 한다면
 * 저 구문이 얼만큼의 비용을 소비할지 가늠해보세용
 */

// 시간초과 ㅜㅡㅠ
public class Main_9935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int len1 = str1.length();
		int len2 = str2.length();
		if((len1>=1 || len1<=1000000)&&(len2>=1||len2<=36)) {
			while(str1.indexOf(str2)!=-1) {
				len1 = str1.length();
				str1 = str1.substring(0, str1.indexOf(str2)).concat(str1.substring(str1.indexOf(str2)+len2,len1));
			}
			
//			유준혁 멘토 코드
//			while(str1.indexOf(str2) != -1) {
//				str1 = str1.replace(str2, "");
//			}
			System.out.println((str1.trim().length()==0)?"FRULA":str1);
		}
	}
}
