package 유준혁;
/*
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 * 프로그래머스 완주하지 못한 선수
 * -----------------------
 * List 사용
 */
import java.util.*;
public class prgmers_42576_3 {
	static public String solution(String[] participant, String[] completion) {
        List<String> list = new ArrayList<>();
        for(String s : participant) list.add(s);
        for(String s : completion) list.add(s);
        list.sort((a, b)->{return a.compareTo(b);});
        int size = list.size();
        for(int i = 0; i < size - 1; i += 2) {
        	String a = list.get(i), b = list.get(i + 1);
        	if(a.equals(b) == false) {
        		return list.get(i);
        	}
        }
    	return list.get(size - 1);
    }
	public static void main(String[] args) {
		System.out.println(solution(new String[] {"a", "b", "c", "c"}, new String[] {"a", "b", "c"}));

	}
}
