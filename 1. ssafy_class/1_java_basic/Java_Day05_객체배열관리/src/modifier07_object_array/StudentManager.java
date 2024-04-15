package modifier07_object_array;

public class StudentManager {
    // 학생들의 배열을 갖고 있는 객체.
	// 학생들의 배열을 관리
	// 싱글턴 패턴을 적용해서 객체가 하나만 생성되게 함.
	
	// 빈 배열을 만듦.
	private Student[] students = new Student[100]; // 학생 정보는 최대 100명까지 저장하게끔.
	
	private int size = 0; // 학생들의 수
	
    private StudentManager() {
    	
    }
    
    private static StudentManager instance = new StudentManager();
    
    public static StudentManager getInstance() {
    	return instance;
    }
    
    // 학생수를 추가하는 메서드
    public void addStudent(Student st){
    	students[size] = st;
    	size++;
    }
    
    //학생 정보를 가져오는데, 이름을 통해서 가져오기.
    public Student getStudent(String name) {
    	for(int i = 0; i <size; i++) {
    		if(name.equals(students[i].getName())) {
    			return students[i];    			
    		}
    	}
    	return null;    	
    }
    
    public void changeMajor(String name, String major) {
    	Student st = getStudent(name);
    	if(st != null) { // 학생 이름을 통해 찾았다면,
    		st.setMajor(major);
    	} else {
    		System.out.println("학생을 찾을 수 없습니다.");
    	}
    	
    }
    
}
