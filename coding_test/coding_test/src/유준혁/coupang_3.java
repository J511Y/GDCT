package 유준혁;
import java.util.*;

public class coupang_3 {
	static int len, max;
	static int[] vst;
	static int[][] del;
	static int[] w = new int[] {1, -1, len, -len};
	static List<Integer> list = new ArrayList<>();
	
	static void dfs(int x, int sum, int time) {
		/// 출력을 위한 list
//		list.add(x);
		vst[x] = 1; // 방문했음을 남김
		if(time == 16) return; // 방문 제한 시간 최대 16
		for(int i = 0; i < 4; i++) {
			int a = x + w[i];
			if(i < 2 && (a / len != x / len)) continue;
			// i < 2 = 좌우로 이동할 경우 인데 1차원배열에서 돌리다보니 가끔 문제가 생기는게 있어서 따로 처리해줌
			// ex) x = 3, i = 1, len = 3일 경우 a = 3 + (-1)이 되는데 원래라면 이동을 못해야하지만 코드상에서는 이동이 가능해져버렸음
			// 그래서 나눈 몫이 같은 경우에만 이동을 하도록 설정
			if(0 <= a && a < (len * len)) { // 범위 내에 들어있는지
				int tmpSum = sum;
				boolean already = vst[a] == 1; // 이미 방문했었는지를 체크해두었다가 vst 갱신할때 쓰임
				if(del[a][0] > time && vst[a] == 0) { // 시간내에 도착 가능하고 아직 방문하지 않은 곳이라면
					tmpSum += del[a][1]; // 팁을 더해줌
					max = Math.max(max, tmpSum); // max값 갱신
					
					/// 출력문
//					list.add(a);
//					System.out.println(list + "\n=>" + tmpSum + "\n");
//					list.remove(list.size() - 1);
				}
				dfs(a, tmpSum, time + 1); // 재귀 실행
				
				/// 출력문
//				list.remove(list.size() - 1);
				
				vst[a] = already ? 1 : 0; // 재귀가 종료됐을때 이전에 이미 방문했던 곳이라면 방문했음을 유지, 아니라면 0으로 바꿔줌.
			}
		}
	}
	static int solution(int r, int delivery[][]) {
		// 초기화
		del = delivery;
		vst = new int[r * r];
		len = r;
		w[2] = len; w[3] = -len;
		max = delivery[0][1];
		
		//재귀 실행
		dfs(0, delivery[0][1], 0);
		return max;
	}
	public static void main(String[] args) {
//		System.out.println(solution(3, new int[][]{{1, 5},{8, 3},{4, 2},{2, 3},{3, 1},{3, 2},{4, 2},{5, 2},{4, 1}} ));
		System.out.println(solution(4, new int[][]
				{{1,10},{8, 1},{8, 1},{3, 100},{8, 1},{8, 1},{8, 1},{8, 1},{8, 1},{8, 1},{8, 1},{8, 1},{9, 100},{8, 1},{8, 1},{8, 1}}
		));
	}
}
