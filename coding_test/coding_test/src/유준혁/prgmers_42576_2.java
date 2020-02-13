package 유준혁;
/*
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 * 프로그래머스 완주하지 못한 선수
 * -----------------------
 * Map 사용
 */
import java.util.*;
public class prgmers_42576_2 {
	static public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hm= new HashMap<String,Integer>();
		String result="";
		for (String p : participant) {
			hm.put(p, hm.getOrDefault(p, 0) + 1);
		}
		
		for (String c : completion) {
			hm.put(c, hm.get(c) - 1);
		}
		
		for (String p : participant) {
			if(hm.get(p) != 0) {
				result = p;
			}
		}
    	return result;
    }
	public static void main(String[] args) {
		System.out.println(solution(new String[] {"a", "b", "c"}, new String[] {"b", "c"}));

	}
}
