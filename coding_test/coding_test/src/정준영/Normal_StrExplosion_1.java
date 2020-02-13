package 정준영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Normal_StrExplosion_1 {

	public static void main(String[] args) throws IOException {
		// 런타임 에러 ㅠㅠ
		// 메모리 초과;;;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String exp = br.readLine();
		while(true) {
			Boolean check = false;
			for(int i = 0; i < (str.length() - exp.length()) + 1; i++) {
				if(str.substring(i, (i + exp.length())).equals(exp)) {
					str = str.substring(0, i) + str.substring((i + exp.length()));
					check = true;
					if(str.length() < exp.length()) break;
				}
			}
			if(!check) break;
		}
		if(str.length() == 0) System.out.println("FRULA");
		else System.out.println(str);
		
	}

}
