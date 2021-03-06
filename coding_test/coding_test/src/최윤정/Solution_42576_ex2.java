package 최윤정;

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

//테스트 케이스는 통과인데... 
// 효율 0...

/*
 * 유준혁 멘토 덧댐 2020.02.10 00:02
 * ---------------------------
 * 코드 상에서는 result에 어떤것도 담아주지 않기 때문에 통과하지 못했겠지만
 * 흐름상으로 보자면 hm의 모든 키값에 대해 밸류가 1이라면 걔가 바로 통과하지 못한 선수라고 하는 듯 하다.
 * 정확히 모르겠어서 확인이 필요하겠지만.. 효율 안나오는건 몰랐넹 코드 짜고 제출해보고 오겠음
 * 
 * 효율이 구데기인건 맞지만 간당간당하게 통과는 한 듯..?
 * 코드를 봐야 알겠네여
 */
public class Solution_42576_ex2 {
	public String solution(String[] participant, String[] completion) {
//		최윤정 코드
//		HashMap<String, Integer> hm= new HashMap<String,Integer>();
//		String result="";
//		for (String c : completion) {
//			hm.put(c, 1);
//		}
//		System.out.println(hm);
//		for (String p : participant) {
//			hm.putIfAbsent(p, 2);
//			hm.put(p, hm.getOrDefault(p, -1));
//		}
//		System.out.println(hm);
//    	return result;
    	
//		유준혁 코드
    	HashMap<String, Integer> hm= new HashMap<String,Integer>();
		String result="";
		for (String p : participant) {
			hm.put(p, hm.getOrDefault(p, 0) + 1);
		}
		
		for (String c : completion) {
			hm.put(c, hm.get(c) - 1);
		}
		
		for (String p : participant) {
			if(hm.get(p) != 0) result = p;
		}
    	return result;
    }

    
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
