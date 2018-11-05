package problem16194;

import java.util.Scanner;

/**
 * 카드구매하기 2.
 * https://www.acmicpc.net/problem/16194
 * 
 * @author EUNJEONG SONG
 */
public class BJ16194 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] price = new int[num + 1];
		int[] memo = new int[num + 1];
		for(int i=1; i<= num; i++) {
			int val =  sc.nextInt();
			price[i] = val;
			memo[i] = val;
		}
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j < i; j++) {	
				if(memo[i] > memo[j] + price[i - j]) {
					memo[i] = memo[j] + price[i - j];
				}
			}
		}
		
	    System.out.println(memo[num]);
	}

}
