package Á¤ÁØ¿µ;
import java.util.Scanner;

public class Easy_Palindrome_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean check = true;
		String str = sc.next();
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt((str.length() - 1) - i)) check = false;
		}
		if(check == true) System.out.println(1);
		else System.out.println(0);
	}

}
