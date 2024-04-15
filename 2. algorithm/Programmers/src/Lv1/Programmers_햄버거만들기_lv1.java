package Lv1;

import java.util.Stack;

public class Programmers_햄버거만들기_lv1 {
	public static int solution(int[] ingredient) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i: ingredient) {
        	stack.push(i);
        	
        	
        }
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		
		System.out.println(solution(ingredient));
	}
}
