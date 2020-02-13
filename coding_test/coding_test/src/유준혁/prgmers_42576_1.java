package 유준혁;
/*
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 * 프로그래머스 완주하지 못한 선수
 * -----------------------
 * Arrays 클래스 이용 + 정렬
 */
import java.util.*;
public class prgmers_42576_1 {
	static private String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
        for(int i = 0; i < completion.length; i++) {
        	if(participant[i] != completion[i]) return participant[i];
        }
        return participant[participant.length - 1];
    }
	public static void main(String[] args) {
		System.out.println(solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}));

	}
}
