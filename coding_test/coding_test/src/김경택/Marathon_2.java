package ±Ë∞Ê≈√;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Marathon_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] participant = br.readLine().split(", ");
		String[] completion = br.readLine().split(", ");
		String answer = "";
		
		List<String> partlist = new ArrayList<>(Arrays.asList(participant));
		List<String> complelist = new ArrayList<>(Arrays.asList(completion));

		for(int a = 0 ; a < partlist.size();a++) {
			if(complelist.contains(partlist.get(a))) {
				complelist.set(complelist.indexOf(partlist.get(a)), "");
				partlist.set(partlist.indexOf(partlist.get(a)), "");
			}
			if(!partlist.get(a).isBlank()) {
				answer = partlist.get(a);
			}
		}
		
		
		System.out.println(answer);
		
	}
}
