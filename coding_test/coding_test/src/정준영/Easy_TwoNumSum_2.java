package 정준영;

/*
 * 유준혁 멘토 덧댐 2020.02.09 20:30
 * ---------------------------
 * 일반적인 방법.
 * 대소 구분이 없이 주어지므로 3가지의 예외처리를 하여 return하는 방식.
 * 
 * 반복문 변경 (for -> while) 외에 차이점 없음. 한 가지 풀이로 분류.
 */
public class Easy_TwoNumSum_2 {
	public static void main(String[] args) {
		System.out.println(solution(3, 5));
		System.out.println(solution(5, 3));
		System.out.println(solution(3, 3));
	}

	public static long solution(int a, int b) {
		long answer = 0;
		if (a > b) {
			a = a + 1;
			while (a-- > b)
				answer += a;
		} else if (a < b) {
			b = b + 1;
			while (b-- > a)
				answer += b;
		} else
			answer = a;
		return answer;
	}
}
