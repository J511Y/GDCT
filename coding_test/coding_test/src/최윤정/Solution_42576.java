package cyj;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;


/* 
 * 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주
 * 
 * 완주하지 못한 선수의 이름을 return 하도록 solution 함수
 * 
 * completion의 길이는 participant의 길이보다 1 작습니다.
 * 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
 * 참가자 중에는 동명이인이 있을 수 있습니다.
 * 
 * 해시는 Key-value쌍으로 데이터를 저장하는 자료구조입니다.
 * 해시를 이용하면 더 효율적으로 해결
 */

// 효율성 0점일때는 정렬를 해보자!!!!!!!!!!!!

//데이터와 중복된 키와 값을 저장하면, 기존의 값은 없어지고 마지막에 저장된 값이 남게 된다.

public class Solution_42576 {
	//성공했다....흐엉
    public String solution(String[] participant, String[] completion) {
    	Stack<String> s = new Stack<String>();
    	Arrays.sort(participant);
    	Arrays.sort(completion, Collections.reverseOrder());
    	for (int i = 0; i < participant.length; i++) {
				s.add(participant[i]); //0 1 2 
				if(i!=0) s.remove(completion[completion.length-i]);//0 1
		}
    	return s.firstElement();
    }

	
  //효율성 0점....
//    public String solution(String[] participant, String[] completion) {
//    	Stack<String> s = new Stack<String>();
//    	for (int i = 0, j = 0; i < participant.length||j<completion.length; i++) {
//    		if(s.size()==participant.length-1||j!=0) {
//    			s.remove(completion[j]);
//    			j++;
//    		}else {
//    			s.add(participant[i]);
//    		}
//    	}
//    	return s.firstElement();
//    }
    
    public static void main(String[] args) {
    	Solution_42576 s = new Solution_42576();
    	String[] p1 = {"leo", "kiki", "eden"};
    	String[] c1 = {"kiki", "eden"};
		System.out.println(s.solution(p1, c1));
		String[] p2 = {"marina","josipa","nikola","vinko","filipa"};
		String[] c2 = {"marina","josipa","nikola","filipa"};
		System.out.println(s.solution(p2, c2));
		String[] p3 = {"mislav","stanko","mislav","ana"};
		String[] c3 = {"stanko","mislav","ana"};
		System.out.println(s.solution(p3, c3));
	}
}
