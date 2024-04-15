package modifier05_getter_setter;

// getter(접근자)와 setter(설정자)를 이용한 캡슐화 구현
public class Person {
	   // 1. 데이터필드(멤버변수)는 외부에서 접근못하게
	   // private으로 막음.
	   private String name;
	   private int age;
	   private String hobby;
	
	   	   
	   // 2. 접근가능하도록 합법적인 통로를 열어준다.
	   // - 이것이 getter(접근자)와 setter(설정자)
	   // => 각각 메서드임.
	   
	   // 접근자(getter)
	   // - 자료형 get멤버변수명() {
	   //		return 멤버변수;
	   // }
	   // 메서드명 : camelCase로 작성함.
	   
	   // 실제 필드명은 name이지만 접근자에서는 getName(대문자)
	   public String getName(){
		   return name;
	   }
	   
	   // 설정자(setter)
	   // public void set멤버변수명(자료형 매개변수){
	   //		멤버변수 = 매개변수값;
	   // }
	   
	   public void setName(String name) {
		   this.name = name;		   
	   }

		public int getAge() {
			return age;
		}
	
		public void setAge(int age) {
			if(age < 0) {
				System.out.println("나이가 음수가 될 수 없다..");
				return ;
			}
			this.age = age;
		}
	
		public String getHobby() {
			return hobby;
		}
	
		public void setHobby(String hobby) {
			this.hobby = hobby;
		}

}
