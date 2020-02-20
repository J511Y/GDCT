package ������;

import java.util.*;
public class coupang_2 {
	static int result = 0, K, T;
	static int[] Arr;
	static void dfs(int idx, int sum, int cnt) {
		if(cnt >= K && sum <= T) result++; // k�� �̻��� �� ���� T ������ ���
		for(int i = idx + 1; i < Arr.length; i++) { // idx + 1 ���� �����Ͽ� �� ����
			if(sum + Arr[i] <= T) dfs(i, sum + Arr[i], cnt + 1);
			// sum + Arr[i]�� T ������ ��� ��� ����
		}
	}
	// DFS, BFS = �׷��� Ž�� ���,  DFS = ���, ��Ʈ��ŷ, BFS = ť, �ִܰŸ�
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
