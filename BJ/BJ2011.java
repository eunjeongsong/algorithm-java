import java.util.Scanner;

/**
 * 암호코드. https://www.acmicpc.net/problem/2011
 *
 */
public class BJ2011 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] strArr = str.split("");
		int length = strArr.length;

		int[] memo = new int[length + 1];
		memo[0] = 1;
		memo[1] = 1;

		// 첫글자가 0인 경우 잘못된 암호.
		int num = Integer.parseInt(strArr[0]);
		if (num == 0) {
			System.out.println(0);
			return;
		}

		for (int i = 2; i <= length; i++) {

			// 00, 01, 02, 03, 04, ..., 09
			// 30, 40, 50, 60, ..., 90, 100 오호..!
			int prevNum = Integer.parseInt(strArr[i - 2]);
			num = Integer.parseInt(strArr[i - 1]);

			if (prevNum == 0 && num == 0) { // 이전 글자가 0 이고, 현재 글자가 0 이면 잘못된 암호.
				System.out.println(0);
				return;
			}

			if (num == 0) { // 이전 글자가 0이 아니고, 현재 글자가 0 인 경우.
				memo[i] = memo[i - 2];

			} else { // 이전 글자, 현재 글자 모두 0이 아닌 경우.

				if ((prevNum * 10 + num) > 26) { // 이전 글자 + 현재 글자가 26이 넘는 경우.
					if (num == 0) {// 26이 넘는데 현재가 0 이면 잘못 된 암호.
						System.out.println(0);
						return;
					}
					memo[i] = memo[i - 1] % 1000000;

				} else {
					if (prevNum == 0) {
						memo[i] = memo[i - 1] % 1000000;
					} else {
						memo[i] = (memo[i - 1] + memo[i - 2]) % 1000000;
					}
				}
			}
		}

		System.out.println(memo[length]);
	}

}
