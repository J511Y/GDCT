package 이도영;

// 
// 
// 시간복잡도 O(1)
/*
 * 유준혁 멘토 덧댐 2020.02.09 19:57
 * ---------------------------
 * 등차수열의 합 공식 이용한 방법, 시간복잡도 O(1)
 * 1부터 n까지의 합을 구하는 공식 = (n + 1) * n / 2
 * 작은 숫자를 a, 큰 숫자를 b 라고 가정했을 때 a 부터 b 까지 더하는 방법은 다음과 같다.
 * 1부터 b 까지의 합에서 1부터 a - 1 까지의 합을 뺀다.
 * 
 * ex) a = 3, b = 5
 * aSum = 1 + 2
 * bSum = 1 + 2 + 3 + 4 + 5
 * 이므로 bSum 에서 aSum을 빼면 우리가 원하는 3~5까지의 합이 나오게 된다.
 * 
 * 이를 수식화 하면 다음과 같다.
 * aSum : 1부터 a까지의 합, bSum : 1부터 b까지의 합, result : 결과값
 * 
 * aSum = (a - 1 + 1) * (a - 1) / 2 = a * (a - 1) / 2
 * bSum = (b + 1) * b / 2
 * result 
 * > bSum - aSum
 * > ((b + 1) * b / 2) - (a * (a - 1) / 2)
 * > (((b + 1) * b) - (a * (a - 1))) / 2
 * > (b^2 + b - a^2 + a) / 2
 * > ((a + b)(a - b) + a + b) / 2
 * > (a + b)(a - b + 1) / 2
 * 
 * 위의 공식을 코드화 시키면 아래의 코드가 나오게 된다.
 */
public class solution_v2 {
	public static void main(String[] args) {
		System.out.println(solution(3, 5));
		System.out.println(solution(3, 3));
		System.out.println(solution(5, 3));
	}

	public static long solution(int a, int b) {
		long max = Math.max(a, b);
		long min = Math.min(a, b);
		return (max - min + 1) * (max + min) / 2;
	}
}