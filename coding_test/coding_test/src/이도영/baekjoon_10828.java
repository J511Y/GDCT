package 이도영;

import java.util.*;

public class baekjoon_10828 { // 백준 제출시 Main으로 변경
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		//Scanner는 BufferedReader로
		//갯수가 많다면 elseif보다 switch(5개기준)
		for (int i = 0; i < cnt; i++) {
			String input = sc.next();
			if (input.contains("push")) {
				stack.push(sc.nextInt());
			} else if (input.equals("pop")) {
				System.out.println(stack.isEmpty() ? -1 : stack.pop());
			} else if (input.equals("size")) {
				System.out.println(stack.size());
			} else if (input.equals("empty")) {
				System.out.println(stack.isEmpty() ? 1 : 0);
			} else if (input.equals("top")) {
				System.out.println(stack.isEmpty() ? -1 : stack.peek());
			}
		}
	}
}
