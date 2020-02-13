package Á¤ÁØ¿µ;
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
