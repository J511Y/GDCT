package ±Ë∞Ê≈√;

import java.util.Scanner;

public class Main_9935_1 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		StringBuffer input = new StringBuffer();
		input.append(scan.nextLine());
		
		String bomb = scan.nextLine();

		while (true) {
			if (input.indexOf(bomb) != -1) {
				int at = input.indexOf(bomb);
				input.delete(at, at+bomb.length());
			}else {
				if(input.length()==0) {
					input.append("FRULA");
				}
				break;
			}
		}
		
		System.out.println(input);
	}

}
