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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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
		Set<Integer> set = new HashSet<Integer>();
		int arr[][] = new int[n+1][n+1];
		while (m-- > 0) {
			String[] st = br.readLine().split(" ");
			arr[Integer.parseInt(st[0])][Integer.parseInt(st[1])] = 1;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[1][i] == 1) {// 2,3
				set.add(i);
				for (int j = i; j < arr[i].length; j++) {
					if (arr[i][j] == 1) {
						set.add(j);
					}
				}
			}
		}
		System.out.println(set.size());
//		System.out.println(cnt);
//		System.out.println();
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
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