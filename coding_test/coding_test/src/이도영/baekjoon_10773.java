package �̵���;
import java.util.*;

public class baekjoon_10773 { //����� Main���� ����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int K = sc.nextInt();
		int sum = 0;

		for (int i = 0; i < K; i++) {
			int input = sc.nextInt();
			if (input == 0)
				stack.pop();
			else
				stack.push(input);
		}

		for (Integer i : stack)
			sum += i;
		System.out.print(sum);
	}

}
