package 이도영;
import java.io.*;
import java.util.*;

public class baekjoon_18258 {// 시간초과 
	public static void main(String[] args) throws NumberFormatException, IOException {
		Queue<Integer> queue = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int last = 0;
		int size = 0;
		for (int i = 0; i < cnt; i++) {
			String input = br.readLine();
			String[] values = input.split(" ");

			switch (values[0]) {
			case "push":
				last = Integer.parseInt(values[1]);
				queue.add(last);
				size++;
				break;
			case "pop":
				System.out.println(queue.isEmpty() ? -1 : queue.poll());
				break;
			case "size":
				System.out.println(size);
				break;
			case "empty":
				System.out.println(queue.isEmpty() ? 1 : 0);
				break;
			case "front":
				System.out.println(queue.isEmpty() ? -1 : queue.peek());
				break;
			case "back":
				System.out.println(queue.isEmpty() ? -1 : last);
				break;
			}
		}
	}

}
