package ±Ë∞Ê≈√;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Marathon_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] participant = br.readLine().split(", ");
		String[] completion = br.readLine().split(", ");
		String answer = "";

		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i = 0 ; i < participant.length;i++) {
			for(int j = 0; j< completion.length;j++) {
				if(participant[i].equals(completion[j])) {
					participant[i] = "";
					completion[j] = "";
				}
			}
			if(!participant[i].isEmpty()) {
				answer=participant[i];
				break;
			}
		}
		
		
		System.out.println(answer);
		
	}
}
