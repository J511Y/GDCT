package cyj;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_1844 {
	
	public int solution(int[][] maps) {
		int answer = 0;
		//시작위치[0][0]
		Queue<Integer> q = new LinkedList<Integer>();
		boolean[] visited = new boolean[maps.length];
		int v = 0;
		int n = maps.length-1;
		q.add(v);
		visited[v]=true;
		
		while (!q.isEmpty()) {
			v = q.poll();
			System.out.print(v+",");
			//answer+=v;
			
			for (int i = 0; i<=n; i++) {
				if(maps[v][i]==1 && !visited[i]) {
					q.offer(i);
					visited[i]= true;
					System.out.print(i+",");
				}
			}
			
			for (boolean b : visited) {
				System.out.print(b+"  ");
			}
			System.out.println();
		}
		return answer;
	}
	/*
	 * maps는 n x m 크기의 게임 맵의 상태가 들어있는 2차원 배열
	 * 
	 * n과 m은 각각 1 이상 100 이하의 자연수
	 * 
	 * maps는 0과 1로만 이루어져 있으며, 0은 벽이 있는 자리, 1은 벽이 없는 자리
	 * 
	 * 게임 맵의 좌측 상단인 (1, 1) 위치 : 내 위치
	 * 게임 맵의 우측 하단인 (n, m) 위치 : 상대방 위치
	 * 
	 * 그래프 탐색
	 *  BFS 넓이 우선 탐색 => 인접한 노드를 먼저 탐색
	 *  어떤 노드 방문 했는가? 여부 확인!
	 *  Queue 사용 -> FIFO
	 */
	 public static void main(String[] args) {
		 int[] m0 = {1,0,1,1,1};
		 int[] m1 = {1,0,1,0,1};
		 int[] m2 = {1,0,1,1,1};
		 int[] m3 = {1,1,1,0,1};
		 int[] m4 = {0,0,0,0,1};
		 int[][] maps1 = {m0,m1,m2,m3,m4};
		 
		 System.out.println(new Solution_1844().solution(maps1));
		 
	 }
}
