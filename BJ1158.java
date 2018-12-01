import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 조세퍼스 문제
 * https://www.acmicpc.net/problem/1158
 * 
 */
public class BJ1158 {
	public static void main(String args[]) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		Queue<Integer> queue = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder("<");

		for (int i = 1; i <= n; i++) {
			queue.offer(i);
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < m - 1; j++) {
				queue.offer(queue.poll());
			}
			sb.append(queue.poll() + ", ");
		}

		sb.append(queue.poll() + ">");
		System.out.println(sb);
	}
}
