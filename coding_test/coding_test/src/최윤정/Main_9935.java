package ������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ����̴� ���ڿ��� ���� ���ڿ��� �ɾ� ���Ҵ�. 
 * ���� ���ڿ��� �����ϸ� �� ���ڴ� ���ڿ����� �������, 
 * ���� ���ڿ��� �������� �ȴ�.
 * 
 * ���ڿ��� ���� ���ڿ��� �����ϰ� �ִ� ��쿡, ��� ���� ���ڿ��� �����ϰ� �ȴ�. 
 * ���� ���ڿ��� ������� �̾� �ٿ� ���ο� ���ڿ��� �����.
 * ���� ���� ���ڿ��� ���� ���ڿ��� ���ԵǾ� ���� ���� �ִ�.
 * ������ ���� ���ڿ��� ���ڿ��� ���� ������ ��ӵȴ�.
 * 
 * �����ִ� ���ڰ� ���� ��찡 �ִ�. �̶��� "FRULA"�� ���
 * ���� ���ڿ��� ���� ���ڸ� �� �� �̻� �������� �ʴ´�.
 * 
 * ù° �ٿ� ���ڿ��� �־�����. ���ڿ��� ���̴� 1���� ũ�ų� ����, 1,000,000���� �۰ų� ����.
 * ��° �ٿ� ���� ���ڿ��� �־�����. ���̴� 1���� ũ�ų� ����, 36���� �۰ų� ����.
 * �� ���ڿ��� ��� ���ĺ� �ҹ��ڿ� �빮��, ���� 0, 1, ..., 9�θ� �̷���� �ִ�.
 * 
 * ù° �ٿ� ��� ������ ���� �� ���� ���ڿ��� ����Ѵ�.
 */

/*
 * ������ ���� ���� 2020.02.09 23:53
 * ---------------------------
 * �Ƹ��� String.Replace�� ���� �����ϰ��� �� �� ó�� ����
 * �־��� ��츦 �����ϴ� ������ �ʿ��غ���.
 * 100�� �ڸ��� ���ڿ��� ������, ����� ���� ���� ���߷� ��� ���ڿ��� ������ٰ� �Ѵٸ�
 * �� ������ ��ŭ�� ����� �Һ����� �����غ�����
 */

// �ð��ʰ� �̤Ѥ�
public class Main_9935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int len1 = str1.length();
		int len2 = str2.length();
		if((len1>=1 || len1<=1000000)&&(len2>=1||len2<=36)) {
			while(str1.indexOf(str2)!=-1) {
				len1 = str1.length();
				str1 = str1.substring(0, str1.indexOf(str2)).concat(str1.substring(str1.indexOf(str2)+len2,len1));
			}
			
//			������ ���� �ڵ�
//			while(str1.indexOf(str2) != -1) {
//				str1 = str1.replace(str2, "");
//			}
			System.out.println((str1.trim().length()==0)?"FRULA":str1);
		}
	}
}
