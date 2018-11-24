package problem11053;

import java.util.Scanner;

/**
 * 가장 긴 증가하는 부분 수열. 
 * https://www.acmicpc.net/problem/11053
 * 
 * @author EUNJEONG SONG
 */
public class BJ11053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();		
		int dp[][] = new int[num][2];
		int max = 1;
		
		for(int i = 0; i < num; i++) {
			dp[i][0] = 1; // 현재 최대 길이.
			dp[i][1] = sc.nextInt();  // 마지막 값.
			
			for(int j = 0; j < i; j++) {
				if(dp[j][1] < dp[i][1]) {
					dp[i][0] = Math.max(dp[i][0], dp[j][0] + 1);
				}
			}
			max = max < dp[i][0] ? dp[i][0] : max;
		}
		
		System.out.println(max);
	}

}
