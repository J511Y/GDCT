package coupang_2020;

import java.util.*;
public class coupang_3 {
	static int result = 0, K, T;
	static int[] Arr;
	static void dfs(int idx, int sum, int cnt) {
		if(cnt >= K && sum <= T) result++; // k개 이상 합이 T 이하인 경우
		for(int i = idx + 1; i < Arr.length; i++) { // idx + 1 번째를 선택하도록
			if(sum + Arr[i] <= T) dfs(i, sum + Arr[i], cnt + 1);
			// sum + Arr[i]가 T보다 작다면 재귀 실행
		}
	}
	// DFS, BFS = 그래프 탐색 방법 DFS = 재귀, 브루트포스, BFS = 큐, 최단거리
	static public int solution(int[] arr, int k, int t) {
		Arr = arr;
		K = k;
		T = t;
		for(int i = 0; i < Arr.length; i++) {
			dfs(i, arr[i], 1);			
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(solution(new int[] {2,5,3,8,1}, 3, 11));
		result = 0;
		System.out.println(solution(new int[] {1,1,2,2}, 2, 3));
		result = 0;
		System.out.println(solution(new int[] {1,2,3,2}, 2, 2));
	}
}
