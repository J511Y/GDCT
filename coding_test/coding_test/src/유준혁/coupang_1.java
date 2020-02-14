package ¿Ø¡ÿ«ı;

import java.util.*;
public class coupang_1 {
	static public long solution(int[][] goods, int[][]coupons) {
		long answer = 0;
	    int gCnt = 0, cCnt = 0;
	    List<Double> gds = new ArrayList<>();
	    List<Double> cps = new ArrayList<>();
	    for(int[] g : goods) {
	    	gCnt += g[1];
	    	for(int i = 0; i < g[1]; i++) {
	    		gds.add((double)g[0]);
	    	}
	    }
	    for(int[] c : coupons) {
	    	cCnt += c[1];
	    	for(int i = 0; i < c[1]; i++) {
	    		cps.add((double)c[0]);
	    	}
	    }
	    
	    gds.sort((a, b) -> {return (int)(b - a);});
	    cps.sort((a, b) -> {return (int)(b - a);});
	    for(int i = 0; i < gCnt; i++) {
	    	if(i < cCnt) {
	    		answer += (int)(gds.get(i) * (100 - cps.get(i)) / 100);
	    	}else {
	    		answer +=  gds.get(i);
	    	}
	    }
	    return answer;
    }
	public static void main(String[] args) {
		int[][] a = new int[][]{{25400, 2}, {10000, 1}, {31600, 1}};
		int[][] b = new int[][]{{5, 3}, {23, 2}, {11, 2}, {9, 5}};
		System.out.println(solution(a, b));
	}
}