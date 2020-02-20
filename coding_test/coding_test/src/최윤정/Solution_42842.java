package 최윤정;
//완전탐색_카펫
public class Solution_42842 {
	public int[] solution(int brown, int red) {
        int[] answer = new int[2];
        //10 2 =12
        int width = brown+red;
        //12의 약수 구하기
        for (int i = 1; i <= width; i++) {
			if(width%i==0&&(i+width/i)*2-4==brown) {
				answer[0]=i;
				answer[1]=width/i;
			}
		}
        return answer;
    }
	public static void main(String[] args) {
		int brown = 10;
		int red = 2;
		int answer[]=new Solution_42842().solution(brown,red);
		for (int i : answer) {
			System.out.println(i);
		}
//		brown= 8;
//		red = 1;
//		System.out.println
//		(new Solution_42842().solution(brown,red));
//		brown= 24;
//		red = 24;
//		System.out.println
//		(new Solution_42842().solution(brown,red));
	}
}
