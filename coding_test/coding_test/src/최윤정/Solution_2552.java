package 최윤정;
//스킬체크 문제
public class Solution_2552 {
    public boolean solution(String[] phone_book) {
        for (int i = 0; i < phone_book.length; i++) {
        	for (int j = i+1; j < phone_book.length; j++) {
        		if(phone_book[j].startsWith(phone_book[i])
        				||phone_book[i].startsWith(phone_book[j])) {
        			return false;
        		}
        		//System.out.println("i="+i+",j="+j);
			}
		}
        return true;
    }
    public static void main(String[] args) {
    	String[] phone_book=
    		{"119","97674223","1195524421"};
    	System.out.println
    	(new Solution_2552().solution(phone_book));
    	String[] phone_book2=
    		{"123","456","789"};
    	System.out.println
    	(new Solution_2552().solution(phone_book2));
    	String[] phone_book3=
    		{"12","123","1235","567","88"};
    	System.out.println
    	(new Solution_2552().solution(phone_book3));
	}
}
