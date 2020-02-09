package cyj;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;


/* 
 * �� �� ���� ������ �����ϰ�� ��� ������ �������� ����
 * 
 * �������� ���� ������ �̸��� return �ϵ��� solution �Լ�
 * 
 * completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
 * �������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
 * ������ �߿��� ���������� ���� �� �ֽ��ϴ�.
 * 
 * �ؽô� Key-value������ �����͸� �����ϴ� �ڷᱸ���Դϴ�.
 * �ؽø� �̿��ϸ� �� ȿ�������� �ذ�
 */

// ȿ���� 0���϶��� ���ĸ� �غ���!!!!!!!!!!!!

//�����Ϳ� �ߺ��� Ű�� ���� �����ϸ�, ������ ���� �������� �������� ����� ���� ���� �ȴ�.

public class Solution_42576 {
	//�����ߴ�....���
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

	
  //ȿ���� 0��....
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
