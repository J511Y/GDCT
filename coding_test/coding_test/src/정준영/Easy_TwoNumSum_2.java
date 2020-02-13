package Á¤ÁØ¿µ;
public class Easy_TwoNumSum_2 {

	public static void main(String[] args) {
		System.out.println(solution(3, 5));
		System.out.println(solution(5, 3));
		System.out.println(solution(3, 3));
	}
	
	public static long solution(int a, int b) {
	      long answer = 0;
	      if(a > b) {
	    	  a = a + 1;
	    	  while(a --> b) answer += a;
	      }
	      else if(a < b) {
	    	  b = b + 1;
	    	  while(b --> a) answer += b;
	      }
	      else answer = a;
	      return answer;
	}
}
