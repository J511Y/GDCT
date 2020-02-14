package 유준혁;
// 풀다말았음
import java.util.*;
public class coupang_1 {
	static int len, max;
	static int[] vst;
	static int[][] del;
	static int[] w = new int[] {1, -1, len, -len};
	
	static void dfs(int x, int sum, int time) {
		if(time == len * len) return;
		for(int i = 0; i < 4; i++) {
			int a = x + w[i];
			if(0 <= a && a < (len * len)) {
				int tmpSum = sum;
				boolean already = vst[a] == 1;
				if(del[a][0] > time && vst[a] == 0) {
					tmpSum += del[a][1];
					max = Math.max(max, tmpSum);
				}
				vst[a] = 1;
				dfs(a, tmpSum, time + 1);
				vst[a] = already ? 1 : 0;
			}
		}
	}
	static int solution(int r, int delivery[][]) {
		del = delivery;
		vst = new int[r * r];
		len = r;
		w[2] = len; w[3] = -len;
		vst[0] = 1;
		max = delivery[0][1];
		dfs(0, delivery[0][1], 0);
		return max;
	}
	public static void main(String[] args) {
		System.out.println(solution(3, new int[][]{{1, 5},{8, 3},{4, 2},{2, 3},{3, 1},{3, 2},{4, 2},{5, 2},{4, 1}} ));
	}
}
