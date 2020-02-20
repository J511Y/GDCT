package 정준영;
/*
 * 유준혁 멘토 덧댐 2020.02.09 20:26
 * ---------------------------
 * 일반적인 방법.
 * 대소 구분이 없이 주어지므로 3가지의 예외처리를 하여 return하는 방식.
 * 
 * 특이점 : 숏코딩을 하려는 게 보임.
 */
public class Easy_TwoNumSum_1 {
	 public static void main(String[] args) {
		  System.out.println(solution(3, 5));
		  System.out.println(solution(5, 3));
		  System.out.println(solution(3, 3));
	 }
	 
	 public static long solution(int a, int b) {
	       long answer = 0;
	       if(a > b) for(int i = b; i <= a; i++) answer += i;
	       else if(a < b) for(int i = a; i <= b; i++) answer += i;
	       else answer = a;
	       return answer;
	 }
}