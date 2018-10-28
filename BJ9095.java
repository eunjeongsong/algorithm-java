import java.util.Scanner;

/**
 * 1, 2, 3 더하기 
 * https://www.acmicpc.net/problem/9095
 * 
 * @author EUNJEONG SONG
 */
public class BJ9095 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			int input = sc.nextInt();
			System.out.println(solution(input));
		}

	}

	private static int solution(int input) {
		if (input == 1) {
			return 1;
		} else if (input == 2) {
			return 2;
		} else if (input == 3) {
			return 4;
		} else {
			return solution(input - 1) + solution(input - 2) + solution(input - 3);
		}
	}

}
