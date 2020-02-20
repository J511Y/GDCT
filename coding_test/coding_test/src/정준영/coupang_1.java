package Á¤ÁØ¿µ;
import java.util.List;

public class coupang_1 {

	public static void main(String[] args) {
		int arr[] = {2, 5, 3, 8, 1};
		int k = 3;
		int t = 11;
		
		solution(arr, k);
	}

	private static void solution(int[] arr, int k) {
		int[] temp = new int[k];
		combination(arr , 0, k, temp);
	}

	private static void combination(int[] arr, int i, int k, int[] temp) {
		if(0==k) {
			for(int index = 0; index < temp.length; index++) {
				System.out.print(arr[temp[index]] + " ");
			}
			System.out.println();
			return;
		}

		for(int index = i; index < arr.length; index++) {
			temp[temp.length-k] = index;
			combination(arr,i+1,k-1, temp);

		}
	}

}
