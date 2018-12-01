import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 에디터
 * https://www.acmicpc.net/problem/1406
 * 
 * 	L 커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨) 
 *	D 커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시됨) 
 *  B 커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨) 삭제로 인해 커서는 한 칸 왼쪽으로 이동한 것처럼 나타나지만, 실제로 커서의 오른쪽에 있던 문자는 그대로임 
 *  P $ $라는 문자를 커서 왼쪽에 추가함
 * 
 */
public class BJ1406 {
	
	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> left = new Stack<Character>();
        Stack<Character> right = new Stack<Character>();		
        for (int i=0; i<s.length(); i++) {
            left.push(s.charAt(i));
        } 
		
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i< num; i++) {
			String[] commandStrArr = br.readLine().split(" ");
            char command = commandStrArr[0].charAt(0);
            if (command == 'L' && !left.empty()) {
				right.push(left.pop());
				
			} else if (command == 'D' && !right.empty()) {
				left.push(right.pop());
				
			} else if (command == 'B' && !left.empty()) {
				left.pop();
				
			} else if (command == 'P') {
				left.push(commandStrArr[1].charAt(0));
            }
        }
        
        while(!left.empty()) {
        	right.push(left.pop());
        }
        
        StringBuilder sb = new StringBuilder();
        while(!right.empty()) {
        	sb.append(right.pop());
        }
        
        System.out.println(sb);
	}
	
}
