package Á¤ÁØ¿µ;
import java.util.Scanner;

public class Normal_StrExplosion_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String exp = sc.next();
		int i = 0;
		
		while(true) {
			if(i >= str.length() || str.length() == 0) break;
			Boolean to = false;
			if(str.charAt(i) == exp.charAt(0)) {
				Boolean ck = false;
				for(int j = 0; j < exp.length(); j++) {
					if(str.charAt(i + j) != exp.charAt(j)) {
						ck = true;
						break;
					}
				}
				if(!ck) {
					str = str.substring(0, i) + str.substring(i + exp.length(), str.length());
					i = 0;
					to = true;
				}
			}
			if(!to) i++;
		}
		if(str.length() == 0) System.out.println("FRULA");
		else System.out.println(str);
	}

}
