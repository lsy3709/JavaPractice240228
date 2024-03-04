package ex_240304;

// 클래스 정의
 class Animal {
	 // 하나의 클래스에는 , 각각 한개씩 원래 사용을함. 
	 // 지금은 예시로, 클래스 안에 또다른 클래스를 보여주기용. 
	 // 파일 분리함. 
	 
	 // 클래스 : 설계도면, 공장, 
	 // 실체, 제품 : 인스턴스라고 부른다. 
	 
	 // 구성 : 1) 멤버(변수), 2) 메서드(기능)
	 
	 // private를 사용하면, 외부 접근이 안되어서, 추후 setter/getter 로 접근 하는 방법 알려드릴 예정. 
	 // 그래서, 현재는 public 으로 변경하기. 
//	 private String name;
//	 private int age;
	 public String name;
	 public int age;
	 
	 // 메서드 : 1) 소개하는 기능, 2) 소리 기능. 
	 
	 public void introduceMethod() {
		 System.out.println("안녕하세요.! 현재는 더미로 작업중, 곧 동적으로 할 예정임.");
	}
	 
	 public void soundMethod() {
		 System.out.println("현재는, 더미로 소리를 냅니다. 나중에는 동적으로 할 예정. ");
	}
	 
	
}

public class Ex_02_class_1 {

	public static void main(String[] args) {
		// 클래스 사용 
		// 문법)
		// 클래스명 레퍼런스변수명 = new 클래스명();
		// new 뒤에 클래스명() => 생성자라고 부름, 해당 인스턴스를 초기화시 사용함. 
		// 지금은 디폴트 생성자로 만들고, 그리고, 매개변수를 이용해서, 생성자를 만들 계획. 
		// 오버로딩이라는 개념도 간단히 언급하고, this 라는 키워드 도 간단히 언급을 할 예정. 
		Animal ani1 = new Animal(); // 공장에서 마치 제품을 찍어 내듯이, 만들기, 예를 인스턴스라고 부름. 
		Animal ani2 = new Animal(); // 각각의 인스턴스들은 다르다고 봅니다. 프로그래밍에서는 
		Animal ani3 = new Animal(); // 각각의 인스턴스들의 가리키는 메모리 위치 주소과 다릅니다. 
		
		//사용방법, 객체 사용법 ? -> 점 연산자를 이용해서, 표현, 수납도구에서 꺼내듯이 사용함.
		// 접근지정자를 private 선언을 하면, 이처럼
		// 외부에서 접근이 안됩니다. 
		// 그러면, 제가 조금 있다가 setter/getter 를 소개를 함. 
		// 그래서, 다시 접근 지정자를 private -> public, 생략하면(default)
		ani1.name = "ani1";
		ani1.age = 10;
		ani1.introduceMethod();
		ani1.soundMethod();
		
		
		
		

	}

}
