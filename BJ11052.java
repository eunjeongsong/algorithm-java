import java.util.Scanner;

/**
 * 카드구매하기.
 * https://www.acmicpc.net/problem/11052
 * 
 * @author EUNJEONG SONG
 */
public class BJ11052 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	    
		int[] price = new int[num + 1];
	    for (int i = 1; i <= num; i++) {
	        price[i] = sc.nextInt();
	    }
	    
	    int[] memo = new int[num + 1];
	    for (int i = 1; i <= num; i++) {
	        for (int j = 1; j <= i; j++) {
		        if (memo[i] < price[j] + memo[i - j]) {
	    	        memo[i] = price[j] + memo[i - j];
		        }
	        }
	    }
	    
	    System.out.println(memo[num]);
		
	}

}
