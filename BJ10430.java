package problem10430;

import java.util.Scanner;

/**
 * 나머지.
 * https://www.acmicpc.net/problem/10430
 * 
 * B = Q2 * C + R2 은    
 * A + B = (Q1 * C) + (Q2 * C) + R1 + R2 이고, 
 * A + B = (Q1 + Q2) * C + R1 + R2 이며,
 * (A + B) % C = R1 + R2 이다.
 * 
 * @author EUNJEONG SONG
 */
public class BJ10430 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// 첫째 줄에 (A+B)%C, 		
		System.out.println((a + b) % c);
		
		// 둘째 줄에 (A%C + B%C)%C, => ((A+B)%C)%C
		System.out.println(((a % c) + (b % c)) % c);
		
		// 셋째 줄에 (A×B)%C, 
		System.out.println((a * b) % c);
		
		// 넷째 줄에 (A%C × B%C)%C를 출력한다.=> ((A*B)%C)%C
		System.out.println(((a % c) * (b % c)) % c);
	}

}
