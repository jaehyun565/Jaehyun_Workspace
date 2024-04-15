package test05_stack;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
    	// stack
    	// - LIFO
    	// - Stack은 클래스임
    	Stack<Integer> stack = new Stack<>();
    	
    	for (int i=0;i<5;i++) {
    		stack.push(i); //stack에 값을 넣는행위
    	}
    	
    	// stack에서 값을 순서대로 꺼내기
    	// - 가장 나중에 들어간 값이, 가장 먼저 나온다! (LIFO, 접시보관함.)
    	while(!stack.isEmpty()) {
    		System.out.println(stack.pop());
    	}

    }
}
