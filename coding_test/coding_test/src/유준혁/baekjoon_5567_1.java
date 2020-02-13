package 유준혁;
/*
 * https://www.acmicpc.net/problem/5567
 * 백준 결혼식
 * -----------------------
 * 인접행렬 + BFS
 */
import java.util.*;
public class baekjoon_5567_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() + 1, m = sc.nextInt(), cnt = 0;
		int[][] arr = new int[n][n];
		boolean[] vst = new boolean[n];
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			arr[a][b] = arr[b][a] = 1;
		}
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {1, 0}); vst[1] = true;
		while(!q.isEmpty()) {
			int[] tmp = q.poll();
			if(tmp[1] < 2) {
				for(int i = 0; i < n; i++) {
					if(arr[tmp[0]][i] == 1 && !vst[i]) {
						q.add(new int[] {i, tmp[1] + 1});
						vst[i] = true;
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
