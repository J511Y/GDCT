package ������;
/*
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 * ���α׷��ӽ� �������� ���� ����
 * -----------------------
 * Arrays Ŭ���� �̿� + ����
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
