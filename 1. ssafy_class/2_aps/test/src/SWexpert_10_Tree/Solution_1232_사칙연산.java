package SWexpert_10_Tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Node {
	int num;
	String data;
	Node left;
	Node right;

	Node() {

	}

	Node(String data) {
		this.data = data;
	}
}

public class Solution_1232_사칙연산 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int testCase=1;testCase<=10;testCase++) {
			int length = Integer.parseInt(br.readLine());
			Node[] nodes = new Node[length + 1];
			
			for (int i = 1; i <= length; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				st.nextToken();
				
				// 루트노드(i=1)일때는 새로운 노드를 만들어준다.
				// 루트노드가 아니면 자식노드이므로, 그 자식노드의 데이터를 넣어준다.
				// 만일 자식노드도 new Node로 하면, 아래에서 연결한 노드랑 다른 객체가 생성되므로 연결이 무의미해진다.
				if (i == 1) {
					nodes[i] = new Node(st.nextToken());
				} else {
					nodes[i].data = st.nextToken();
				}
				
				// 추가로 받을 정보가 있는지 확인하고, 있으면 좌,우(자식)노드를 만들고 연결한다.
				if (st.countTokens() != 0) {
					int leftNum = Integer.parseInt(st.nextToken());
					int rightNum = Integer.parseInt(st.nextToken());
					nodes[leftNum] = new Node();
					nodes[rightNum] = new Node();
					nodes[i].left = nodes[leftNum];
					nodes[i].right = nodes[rightNum];
				}
			}
			
			// 연산식 파트
			// 정점 번호가 높은 쪽부터 계산을 하므로, 가장 큰 쪽부터 루트번호(1)번까지 줄여가면서 계산.
			// 연산자를 만나면 좌측노드와 우측노드를 연산자로 계산해준다.
			// 계산한 그 값을 다시 해당 노드에 넣어준다.
			for (int i = length; i >= 1; i--) {
				if (nodes[i].data.equals("*")) {
					nodes[i].data = (String
							.valueOf(Integer.parseInt(nodes[i].left.data) * Integer.parseInt(nodes[i].right.data)));
				} else if (nodes[i].data.equals("+")) {
					nodes[i].data = (String
							.valueOf(Integer.parseInt(nodes[i].left.data) + Integer.parseInt(nodes[i].right.data)));
				} else if (nodes[i].data.equals("-")) {					
					nodes[i].data = (String
							.valueOf(Integer.parseInt(nodes[i].left.data) - Integer.parseInt(nodes[i].right.data)));
				} else if (nodes[i].data.equals("/")) {
					nodes[i].data = (String
							.valueOf(Integer.parseInt(nodes[i].left.data) / Integer.parseInt(nodes[i].right.data)));
				} else {
					continue;
				}
			}			
			bw.write("#"+testCase+" ");
			bw.write(nodes[1].data+"\n");
			bw.flush();
		}
	}
}
