package cyj;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_1844 {
	
	public int solution(int[][] maps) {
		int answer = 0;
		//������ġ[0][0]
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
	 * maps�� n x m ũ���� ���� ���� ���°� ����ִ� 2���� �迭
	 * 
	 * n�� m�� ���� 1 �̻� 100 ������ �ڿ���
	 * 
	 * maps�� 0�� 1�θ� �̷���� ������, 0�� ���� �ִ� �ڸ�, 1�� ���� ���� �ڸ�
	 * 
	 * ���� ���� ���� ����� (1, 1) ��ġ : �� ��ġ
	 * ���� ���� ���� �ϴ��� (n, m) ��ġ : ���� ��ġ
	 * 
	 * �׷��� Ž��
	 *  BFS ���� �켱 Ž�� => ������ ��带 ���� Ž��
	 *  � ��� �湮 �ߴ°�? ���� Ȯ��!
	 *  Queue ��� -> FIFO
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
