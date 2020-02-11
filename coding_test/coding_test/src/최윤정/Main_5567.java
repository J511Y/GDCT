package 최윤정;

/*
 * 유준혁 멘토 덧댐 2020.02.10 00:36
 * ---------------------------
 * BFS로 풀어보려 한 듯 보임.
 * 아직 확실히 개념이 잡히진 않은 것 같아서 조언하면 
 * BFS = Queue, DFS = Recursion(재귀) 라고만 외워두어도 됨.
 * BFS의 기본 조건이 Queue의 맨 앞 원소를 토대로 반복을 이어가기 때문에
 * while문이 주로 쓰이고 그 후 조건들은 문제를 토대로 변형시키면 됨.
 * 이중 포문을 쓴 건 본인과의 친구 1단계, 친구들의 친구 2단계 라고 생각한듯..?
 * 조금 더 보강이 필요하겠지만 이 정도면 접근은 잘 했음.
 */

import java.io.*;
import java.util.*;
/*
 * 결혼식
 * -그래프
 * -인접 리스트?
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
			int a = Integer.parseInt(st[0]), b = Integer.parseInt(st[1]); // 양방향으로 넣어주기 위함
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
		
		// 유준혁 멘토 풀이
//		Queue<int[]> q = new LinkedList<>(); // BFS정석풀이, int[0] = 인덱스, int[1] = 0 본인 1 친구 2 친구의친구
//		int[] vst = new int[n+1]; // 방문여부를 판단해줄 vst배열
//		int cnt = 0; // 출력값
//		q.add(new int[] {1, 0}); // 본인을 넣어줌.
//		vst[1] = 1; // 본인 방문확인
//		while(!q.isEmpty()){
//			int[] poll = q.poll();
//			int idx = poll[0], link = poll[1];
//			if(link < 2) { // 친구의 친구까지만 확인하기 위함
//				for(int i = 1; i < n + 1; i++) {
//					if(arr[idx][i] == 1 && vst[i] == 0) { // 서로 친구 관계이면서 아직 방문하지 않았을 경우에만 add
//						q.add(new int[] {i, link + 1}); // 관계를 1 증가시켜서 넣어줌
//						cnt++; // 출력값 증가
//						vst[i] = 1; // 방문여부 변경
//					}
//				}
//			}
//		}
//		System.out.println(cnt);
		
		// 유준혁 멘토 풀이 2 기존 코드 변형
		// ---------------------
		// 제출하고 다시 보니까 기존 코드랑 다른게 없네 엌ㅋㅋㅋㅋ 제출했는데 틀렸다면 양방향처리를 안해줘서 그렇겠네요 + j의 시작점
		for(int i = 1 ; i < n + 1; i++) {
			if(arr[1][i] == 1) { // 본인과 직접적인 친구 (1)
				arr2[i] = 1;
				for(int j = 2; j < n + 1; j++) { // 본인인 1은 제외
					if(arr[i][j] == 1) { // 친구의 친구 (2)
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

// 인접 행렬 시도

//인접리스트
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
//	System.out.print(i+"정점의 인접리스트 :");
//	for (int j = 0; j < list.get(i).size(); j++) {
//		System.out.print(list.get(i).get(j)+"=>");
//		cnt++;
//	}
//	System.out.println();
//}
//System.out.println(cnt);