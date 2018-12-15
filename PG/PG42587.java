import java.util.LinkedList;
import java.util.List;

/**
 *	프린터.
 *	https://programmers.co.kr/learn/courses/30/lessons/42587
 *
 */
public class PG42587 {

	public static void main(String[] args) {
		int[] arr1 = { 2, 1, 3, 2 };
		int[] arr2 = { 1, 1, 9, 1, 1, 1 };

		System.out.println(solution(arr1, 2));
		System.out.println(solution(arr1, 3));
		System.out.println(solution(arr2, 0));
	}

	private static int solution(int[] priorities, int location) {
		List<Integer> queue = new LinkedList<>();
		for (Integer priority : priorities) {
			queue.add(priority);
		}

		int count = 0;
		while (queue.size() != 1) {
			Integer current = queue.remove(0);
			if (!queue.stream().anyMatch(element -> current < element)) {
				count += 1;
				if (location == 0)
					return count;
			} else {
				queue.add(current);
			}

			// location 이 0 이라는 것은 내가 출력하고 싶은 출력물이 이번에 출력되지 못하고, 마지막 자리로 가야 한다는 것.
			location = location == 0 ? queue.size() - 1 : location - 1;
		}

		return count + 1;
	}
}
