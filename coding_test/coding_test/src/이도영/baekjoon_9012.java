package �̵���;
import java.util.*;

public class baekjoon_9012 { //����� Main���� ����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      int T = Integer.parseInt(sc.next());
	      
	      for (int i = 0; i < T; i++) {
	         String input = sc.next();
	         String check = "YES";
	         Stack stack = new Stack<>();
	         
	         for (int j = 0; j < input.length(); j++) {
	            
	            if (input.charAt(j) == '(') stack.push(1);
	            else if (input.charAt(j) == ')') {
	               if (stack.isEmpty()) {
	                  check = "NO";
	                  break;
	               }else stack.pop();
	            }
	         }
	         if (!stack.isEmpty()) check = "NO";
	         System.out.println(check);
	      }
	}
}
