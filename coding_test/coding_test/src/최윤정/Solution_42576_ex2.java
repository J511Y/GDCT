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

//�׽�Ʈ ���̽��� ����ε�... 
// ȿ�� 0...
public class Solution_42576_ex2 {
	public String solution(String[] participant, String[] completion) {
		HashMap<String, Integer> hm= new HashMap<String,Integer>();
		String result="";
		for (String c : completion) {
			hm.put(c, 1);
		}
		System.out.println(hm);
		for (String p : participant) {
			hm.putIfAbsent(p, 2);
			hm.put(p, hm.getOrDefault(p, -1));
		}
		System.out.println(hm);
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
