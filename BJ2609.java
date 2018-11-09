package problem2609;

import java.util.Scanner;

/**
 * 최대공약수 및 최대공배수.
 * https://www.acmicpc.net/problem/2609
 * 
 * @author EUNJEONG SONG
 */
public class BJ2609 {
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int gcd = gcd(num1, num2);
		System.out.println(gcd);
		System.out.println((num1 * num2) / gcd);
		
	}
	
	/**
	 * 최대공약수.
	 */
	private static int gcd(int num1, int num2) {
		if(num2 == 0) {
			return num1;
		}else {
			return gcd(num2, num1 % num2);
		}
	}

}
