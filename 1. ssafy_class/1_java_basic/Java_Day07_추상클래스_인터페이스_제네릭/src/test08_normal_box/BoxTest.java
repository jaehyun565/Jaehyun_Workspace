package test08_normal_box;

class Box {
    private Object obj; // 모든 클래스의 조상, 모든 값이 들어갈 수 있음.
    
    public Object getObj() {
        return obj;
    }
    
    public void setObj(Object obj) {
        this.obj = obj;
    }
}

public class BoxTest {
    public static void main(String[] args) {
        
    	Box box1 = new Box();
    	box1.setObj("Hi");
    	box1.setObj(11);
    	box1.setObj(22.1);
    	
    	// 
        // 타입별로 설계도를 만들든지
    	// object 타입으로 만들어서 모든 타입을 다 넣게 반환.
    	// => 자료를 넣을 때는 편하지만, 뺄 때 번거로움 why? 반환도 object로 되기 때문
    	// => 자료를 뺄때는 항상 형 변환을 해줘야 한다는 단점이 있음.
    	
    	Object obj = box1.getObj();
//    	dobule d = (double) obj;
    	
    	
    	// Double은 double자료형의 Wrapper 클래스
    	if( obj instanceof Double) {
    		System.out.println("실수입니다.");
    	}
    	
    }
}