package ������;
//��ųüũ ����
public class Solution_43165 {
	static int answer;
	public int solution(int[] numbers, int target) {
		dfs(numbers,target,0,0);
		return answer;
	}
	private void dfs(int[] numbers, int target,int sum, int node) {
		if(numbers.length==node) {
			if (target==sum) {
				answer++;
			}
		}else {
			dfs(numbers,target,sum+numbers[node],node+1);
			//+1�ϰ��
			dfs(numbers,target,sum-numbers[node],node+1);
			//-1�ϰ��
		}
	}
	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		System.out.println
			(new Solution_43165().solution(numbers, target));
	}
}
