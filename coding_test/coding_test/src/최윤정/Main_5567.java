package ������;

/*
 * ������ ���� ���� 2020.02.10 00:36
 * ---------------------------
 * BFS�� Ǯ��� �� �� ����.
 * ���� Ȯ���� ������ ������ ���� �� ���Ƽ� �����ϸ� 
 * BFS = Queue, DFS = Recursion(���) ��� �ܿ��ξ ��.
 * BFS�� �⺻ ������ Queue�� �� �� ���Ҹ� ���� �ݺ��� �̾�� ������
 * while���� �ַ� ���̰� �� �� ���ǵ��� ������ ���� ������Ű�� ��.
 * ���� ������ �� �� ���ΰ��� ģ�� 1�ܰ�, ģ������ ģ�� 2�ܰ� ��� �����ѵ�..?
 * ���� �� ������ �ʿ��ϰ����� �� ������ ������ �� ����.
 */

import java.io.*;
import java.util.*;
/*
 * ��ȥ��
 * -�׷���
 * -���� ����Ʈ?
 */
public class Main_5567 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
//		Set<Integer> set = new HashSet<Integer>();
		int arr[][] = new int[n+1][n+1];
		int[] arr2 = new int[n+1];
		while (m-- > 0) {
			String[] st = br.readLine().split(" ");
			int a = Integer.parseInt(st[0]), b = Integer.parseInt(st[1]); // ��������� �־��ֱ� ����
			arr[a][b] = arr[b][a] = 1;
		}
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[1][i] == 1) {// 2,3
//				set.add(i);
//				for (int j = i; j < arr[i].length; j++) {
//					if (arr[i][j] == 1) {
//						set.add(j);
//					}
//				}
//			}
//		}
//		System.out.println(set.size());
//		System.out.println(cnt);
//		System.out.println();
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
		
		// ������ ���� Ǯ��
//		Queue<int[]> q = new LinkedList<>(); // BFS����Ǯ��, int[0] = �ε���, int[1] = 0 ���� 1 ģ�� 2 ģ����ģ��
//		int[] vst = new int[n+1]; // �湮���θ� �Ǵ����� vst�迭
//		int cnt = 0; // ��°�
//		q.add(new int[] {1, 0}); // ������ �־���.
//		vst[1] = 1; // ���� �湮Ȯ��
//		while(!q.isEmpty()){
//			int[] poll = q.poll();
//			int idx = poll[0], link = poll[1];
//			if(link < 2) { // ģ���� ģ�������� Ȯ���ϱ� ����
//				for(int i = 1; i < n + 1; i++) {
//					if(arr[idx][i] == 1 && vst[i] == 0) { // ���� ģ�� �����̸鼭 ���� �湮���� �ʾ��� ��쿡�� add
//						q.add(new int[] {i, link + 1}); // ���踦 1 �������Ѽ� �־���
//						cnt++; // ��°� ����
//						vst[i] = 1; // �湮���� ����
//					}
//				}
//			}
//		}
//		System.out.println(cnt);
		
		// ������ ���� Ǯ�� 2 ���� �ڵ� ����
		// ---------------------
		// �����ϰ� �ٽ� ���ϱ� ���� �ڵ�� �ٸ��� ���� ���������� �����ߴµ� Ʋ�ȴٸ� �����ó���� �����༭ �׷��ڳ׿� + j�� ������
		for(int i = 1 ; i < n + 1; i++) {
			if(arr[1][i] == 1) { // ���ΰ� �������� ģ�� (1)
				arr2[i] = 1;
				for(int j = 2; j < n + 1; j++) { // ������ 1�� ����
					if(arr[i][j] == 1) { // ģ���� ģ�� (2)
						arr2[j] = 1;
					}
				}
			}
		}
		int cnt = 0;
		for(int i = 2; i < n + 1; i++) {
			if(arr2[i] == 1) cnt++;
		}
		System.out.println(cnt);
	}
}

// ���� ��� �õ�

//��������Ʈ
//BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
//int n = Integer.parseInt(br.readLine());
//int m = Integer.parseInt(br.readLine());
//int cnt = 0;
//Set<Integer> numlist = new HashSet<Integer>();
//ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
//for (int i =0; i<n+1; i++) {
//	list.add(new ArrayList<Integer>());
//}
//while (m-->0) {
//	String[] st = br.readLine().split(" ");
//	int x = Integer.parseInt(st[0]);
//	int y = Integer.parseInt(st[1]);
//	list.get(x).add(y);
//}
//for (int i = 0; i < list.get(1).size(); i++) {
//	//System.out.println(list.get(1).get(i));
//	numlist.add(list.get(1).get(i));
//	//System.out.println("====================");
//	//System.out.println(list.get(list.get(1).get(i)));
//	numlist.addAll( list.get(list.get(1).get(i)));
//} 
//for (Integer i : numlist) {
//	System.out.println(i);
//}
//System.out.println(numlist.size());
//
//for (int i = 1; i < list.size(); i++) {
//	System.out.print(i+"������ ��������Ʈ :");
//	for (int j = 0; j < list.get(i).size(); j++) {
//		System.out.print(list.get(i).get(j)+"=>");
//		cnt++;
//	}
//	System.out.println();
//}
//System.out.println(cnt);