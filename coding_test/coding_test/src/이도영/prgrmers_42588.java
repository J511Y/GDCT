package ¿Ãµµøµ;

import java.util.Stack;

public class prgrmers_42588 {
	public int[] solution(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[heights.length];
        
        for(int i : heights)  stack.push(i);
        
        while(!stack.isEmpty()){
            int num = stack.pop();
            for(int i=stack.size();i>=0; i--){
                if(num<heights[i]){
                    answer[stack.size()]=i+1;
                    break;
                }
            }
        }
        return answer;
    }


}
