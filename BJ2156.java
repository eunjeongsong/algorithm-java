package problem2156;

import java.util.Scanner;

/**
 * 포도주 시식 https://academy.nomadcoders.co/
 * 
 * @author eunjeong
 *
 */
public class BJ2156 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int[] arr = new int[num + 1];
		for (int i = 1; i <= num; i++) {
			arr[i] = sc.nextInt();
		}

		int[] memo = new int[num + 1];
		for (int i = 1; i <= num; i++) {
			memo[i] = max(arr, memo, i);
		}

		System.out.println(memo[num]);
	}

	private static int max(int[] arr, int[] memo, int i) {
		if (i == 2) {
			return memo[i - 1] + arr[i];
		
		} else if (i >= 3) {
			int max = memo[i - 1];
			int case1 = memo[i - 2] + arr[i];
			int case2 = memo[i - 3] + arr[i - 1] + arr[i];
			
			if (max > case1) {
				return max > case2 ? max : case2;
			} else {
				return case1 > case2 ? case1 : case2;
			}
		
		} else {
			return arr[i];
		}
	}
}
