package Á¤ÁØ¿µ;
import java.util.ArrayList;
import java.util.List;

public class Normal_DontFinitsh_1 {

	public static void main(String[] args) {
		//String[] participant = {"leo", "kiki", "eden"};
		//String[] completion = {"eden", "kiki"};
		String[] participant = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion = { "josipa", "filipa", "marina", "nikola" };

		// for(String s : participant) System.out.println(s);

		System.out.println(solution(participant, completion));

	}

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		List<String> partlist = new ArrayList<>();
		List<String> comlist = new ArrayList<>();

		for (int i = 0; i < participant.length; i++)
			partlist.add(participant[i]);
		for (int i = 0; i < completion.length; i++)
			comlist.add(completion[i]);

		while(true) {
			Boolean ck = false;
			for(int i = 0; i < comlist.size(); i++) {
				if(partlist.get(0).equals(comlist.get(i))) {
					partlist.remove(0);
					comlist.remove(i);
					ck = true;
					break;
				}
			}
			if(!ck) {
				answer = partlist.get(0);
				break;
			}
		}
		return answer;
	}

}
