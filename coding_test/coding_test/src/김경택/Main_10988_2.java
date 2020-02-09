package ±Ë∞Ê≈√;

import java.util.Scanner;

public class Main_10988_2 {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		String intext = scan.nextLine();
		
		StringBuffer reverse = new StringBuffer(intext).reverse();
		String retext = reverse.toString();
		
		if(intext.equals(retext)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}

	}
}
