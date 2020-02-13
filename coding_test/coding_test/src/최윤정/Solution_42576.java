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

/*
 * 유준혁 멘토 덧댐 2020.02.10 00:13
 * ---------------------------
 * Arrays 클래스와 Stack을 같이 사용한 방법
 * 효율성에서 실패했다면 size(), remove() 에서 걸리지 않았을까 싶음.
 * size()는 실행 시 마다 Stack의 크기만큼의 연산이 필요
 * remove()는 최대 Stack 크기만큼의 연산 + 데이터 삭제 연산이 동시에 들어감
 * 어떤 흐름으로 정답에 도달하는지는 아는 것 같은데 아직 경험이 부족한게 아닐까 싶음.
 * 
 * Stack을 사용하기 전에 여러가지 질문을 스스로에게 먼저 해보길.
 * 1. 데이터의 입출력 순서가 신경쓰이는지
 * 2. 이미 정렬된 데이터를 사용한다고 가정하면 Stack을 사용하는게 효율적일지
 * 3. 내가 원하는 데이터가 Stack의 꼭대기에 있음을 보장할 수 있는지
 * 
 * 이와 같은 질문들을 먼저 해보고 그 다음 자료구조를 골라보세용
 */

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
