package day0210;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_18258 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		Deque<Integer> que = new LinkedList<Integer>();
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			switch (s) {
			case "push": {
				int val = Integer.parseInt(st.nextToken());
				que.offer(val);
				break;
			}
			case "pop": {
				if(que.size()==0) {
					sb.append(-1).append("\n");
				}else {
					sb.append(que.poll()).append("\n");
				}
				break;
			}
			case "size": {
				sb.append(que.size()).append("\n");
				break;
			}
			case "empty": {
				if(que.isEmpty()) {
					sb.append(1).append("\n");
				}else {
					sb.append(0).append("\n");
				}
				break;
			}
			case "front": {
				if(que.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(que.peek()).append("\n");
				}
				break;
			}
			case "back": {
				if(que.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(que.peekLast()).append("\n");
				}
				break;
			}
			default :{
				break;
			}
			}
		}
		System.out.println(sb.toString());
		
		
	}

}
