package Lv0;
import java.util.Stack;
public class Programmers_옹알이1 {
	public static void main(String[] args) {
		int answer = 0;
		String[] babbling = {"ayaye1", "uuu2ma", "y3e", "y4emawoo", "yema"};
        Stack<Character> stack = new Stack<>();
        int error=0;
        for(int i =0;i<babbling.length;i++){
            char[] c = babbling[i].toCharArray();
            for(int j=c.length-1;j>=0;j--){
                stack.push(c[j]);
            }
            System.out.println(stack.size());
            while(!(stack.isEmpty())){
                if(stack.peek() == 'a'){
                	stack.pop();
                    if(stack.isEmpty() || stack.peek()!='y'){
                    	error++;
                    	while(!(stack.isEmpty())) {
                    		stack.pop();
                    	}
                        break;
                    } else{
                        stack.pop();
                        if(stack.isEmpty() || stack.peek()!='a'){
                        	error++;
                        	while(!(stack.isEmpty())) {
                        		stack.pop();
                        	}
                            break;
                        } else{
                            stack.pop();
                        }
                    }
                }else if(stack.peek() == 'y'){
                	stack.pop();
                    if(stack.isEmpty() || stack.peek()!='e'){
                    	error++;
                    	while(!(stack.isEmpty())) {
                    		stack.pop();
                    	}
                        break;
                    } else{
                        stack.pop();                        
                    }
                }else if(stack.peek() == 'w'){
                	stack.pop();
                    if(stack.isEmpty() || stack.peek()!='o'){
                    	error++;
                    	while(!(stack.isEmpty())) {
                    		stack.pop();
                    	}
                        break;
                    } else{
                        stack.pop();
                        if(stack.isEmpty() || stack.peek()!='o'){
                        	error++;
                        	while(!(stack.isEmpty())) {
                        		stack.pop();
                        	}
                            break;
                        } else{
                            stack.pop();
                        }
                    }
                }else if(stack.peek() == 'm'){
                	stack.pop();
                    if(stack.isEmpty()|| stack.peek()!='a'){
                    	error++;
                    	while(!(stack.isEmpty())) {
                    		stack.pop();
                    	}
                        break;
                    } else{
                        stack.pop();                        
                    }
                } else {
                	while(!(stack.isEmpty())) {
                		stack.pop();
                	}
                	error++;
                	break;
                }                
            }            
        }
        answer = babbling.length - error;
        System.out.println(answer);
		
	}
	public static int solution(String[] babbling) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i =0;i<babbling.length;i++){
            char[] c = babbling[i].toCharArray();
            for(int j=c.length-1;j>=0;j--){
                stack.push(c[j]);
            }
            while(!(stack.isEmpty())){
                if(stack.pop() == 'a'){
                    if(stack.peek()!='y'){
                        break;
                    } else{
                        stack.pop();
                        if(stack.peek()!='a'){
                            break;
                        } else{
                            stack.pop();
                        }
                    }
                }
                if(stack.pop() == 'y'){
                    if(stack.peek()!='e'){
                        break;
                    } else{
                        stack.pop();                        
                    }
                }
                if(stack.pop() == 'w'){
                    if(stack.peek()!='o'){
                        break;
                    } else{
                        stack.pop();
                        if(stack.peek()!='o'){
                            break;
                        } else{
                            stack.pop();
                        }
                    }
                }
                if(stack.pop() == 'm'){
                    if(stack.peek()!='a'){
                        break;
                    } else{
                        stack.pop();                        
                    }
                }   
            }
            answer++;
        }
        return answer;
    }

	
	    
	
}
