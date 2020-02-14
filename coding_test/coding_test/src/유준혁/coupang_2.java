package 유준혁;
/*
 * 쇼핑몰에서 판매 중인 상품들의 가격이 저장되어있는 배열이 있습니다. 주어진 상품들 중에서 k개 이상의 상품을 선택하여 명절 선물 세트를 만들되, 이 선물 세트에 포함되는 상품들 가격의 합이 t 이하가 되도록 하려고 합니다. 다음은 상품들의 가격이 저장되어있는 배열 [2, 5, 3, 8, 1], k = 3, t = 11 이 주어진 경우의 예시입니다.
먼저 주어진 배열은 5개 상품의 가격이 순서대로 [2, 5, 3, 8, 1]임을 나타냅니다. 이때, 3개 이상의 상품을 선택하는 방법은 총 16가지가 있는데, 이 중, 선택된 상품들의 가격의 합이 11 이하가 되는 경우는 다음과 같이 6가지가 있습니다.

[2, 5, 3]
[2, 5, 1]
[5, 3, 1]
[2, 3, 1]
[2, 8, 1]
[2, 5, 3, 1]
예를 들어 선택한 상품의 가격이 [2, 5, 3, 1] 인 경우, 가격의 합은 2 + 5 + 3 + 1 = 11이므로 11 이하가 됩니다. 그러나 만약 선택한 상품의 가격이 [5, 3, 8]인 경우 가격의 합은 5 + 3 + 8 = 16이므로 이 경우는 불가능한 방법이 됩니다.
상품의 가격이 순서대로 들어있는 배열 arr와 k, t가 매개변수로 주어질 때, arr에서 k개 이상의 상품을 선택했을 때, 금액 합이 t 이하가 되도록 하는 경우의 수를 return 하도록 solution 함수를 완성해주세요.

제한 사항
arr는 상품들의 가격이 순서대로 들어있는 배열이며, 길이는 1 이상 15 이하입니다.
arr의 각 원소는 1 이상 100,000 이하의 자연수입니다.
k는 1 이상 15 이하의 자연수이며, 항상 arr의 길이 이하인 경우만 주어집니다.
t는 1 이상 1,000,000 이하의 자연수입니다.
입출력 예
arr   k   t   result
[2,5,3,8,1]   3   11   6
[1,1,2,2]   2   3   5
[1,2,3,2]   2   2   0
입출력 예 설명
입출력 예 #1
문제의 예시와 같습니다.

입출력 예 #2
다음과 같이 5가지 경우가 가능합니다.

[1, 1], (첫 번째, 두 번째 상품)
[1, 2], (첫 번째, 세 번째 상품)
[1, 2], (첫 번째, 네 번째 상품)
[1, 2], (두 번째, 세 번째 상품)
[1, 2], (두 번째, 네 번째 상품)
입출력 예 #3
2가지 이상을 선택하면서 금액 합계가 2 이하가 되도록 하는 방법은 없습니다.
 */
import java.util.*;
public class coupang_2 {
	static int result = 0, K, T;
	static int[] Arr;
	static void dfs(int idx, int sum, int cnt) {
		if(cnt >= K && sum <= T) result++; // k개 이상을 고른 합이 T 이하인 경우
		for(int i = idx + 1; i < Arr.length; i++) { // idx + 1 부터 시작하여 또 고른다
			if(sum + Arr[i] <= T) dfs(i, sum + Arr[i], cnt + 1);
			// sum + Arr[i]이 T 이하일 경우 재귀 실행
		}
	}
	// DFS, BFS = 그래프 탐색 방법,  DFS = 재귀, 백트래킹, BFS = 큐, 최단거리
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
