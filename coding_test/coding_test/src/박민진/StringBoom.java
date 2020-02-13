
package cote;

import java.util.Scanner;

public class StringBoom {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String content = scan.nextLine();
		String boom = scan.nextLine();
		for(int i=0; i<boom.length(); i++) {
			content = content.replaceAll(boom.charAt(i)+"", ""); 
		}
		if(content.equals("")) {
			System.out.println("FRULA");
		}else {
			System.out.println(content);
		}
	}
}
