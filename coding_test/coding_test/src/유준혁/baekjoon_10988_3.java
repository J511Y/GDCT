package 유준혁;
/*
 * https://www.acmicpc.net/problem/10988
 * 팰린드롬인지 확인하기
 * ----------------
 * 스택과 큐의 입출력 순서 차이점을 이용한 방법
 */
import java.util.*;
public class baekjoon_10988_3 {
	public static void main(String[] args) {
		byte[] arr = new Scanner(System.in).next().getBytes();
		Stack<Byte> stack = new Stack<>();
		Queue<Byte> queue = new LinkedList<>();
		for(byte b : arr) {
			stack.push(b);
			queue.add(b);
		}
		for(int i = 0; i < arr.length; i++) {
			if(stack.pop() != queue.poll()) {
				System.out.println(0);
				return;
			}
		}
		System.out.println(1);
	}
}
