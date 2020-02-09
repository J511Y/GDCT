package ¿Ãµµøµ;

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