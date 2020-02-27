package 이도영;
import java.io.*;
import java.util.*;

public class baekjoon_10866 {//제출시 Main으로 변경
	public static void main(String[] args) throws NumberFormatException, IOException {
		Deque<Integer> dq = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		for (int i = 0; i < cnt; i++) {
			String input = br.readLine();
			String[] values = input.split(" ");

			switch (values[0]) {
			case "push_back":
				dq.addLast(Integer.parseInt(values[1]));
				break;
			case "push_front":
				dq.addFirst(Integer.parseInt(values[1]));
				break;
			case "pop_front":
				System.out.println(dq.isEmpty() ? -1 : dq.pop());
				break;
			case "pop_back":
				System.out.println(dq.isEmpty() ? -1 : dq.removeLast());
				break;
			case "size":
				System.out.println(dq.size());
				break;
			case "empty":
				System.out.println(dq.isEmpty() ? 1 : 0);
				break;
			case "front":
				System.out.println(dq.isEmpty() ? -1 : dq.peek());
				break;
			case "back":
				System.out.println(dq.isEmpty() ? -1 : dq.peekLast());
				break;
			}
		}
	}

}
