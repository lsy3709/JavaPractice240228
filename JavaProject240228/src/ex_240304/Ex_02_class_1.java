package ex_240304;

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

		ani2.name = "ani2";
		ani2.age = 10;
		ani2.introduceMethod();
		ani2.soundMethod();
		
		// 불만사항, 요구사항
		// 1 클래스 내부에 또다른 클래스가 있는 부분 -> 파일 분리 했음. 현재 같은 패키지 내부로 
		// 2 인스턴스 생성시 매번 인스턴스에 점을 찍고, 재할당하는 부분, 한번에 ?
		// -> 예를들어서, 선언시, 기본값을 미리 할당하고, 생성하기. 
		// Animal ani4 = new Animal("ani4", 10);
		// 3 해당 기능들이 , 각각의 동물의 이름이나, 나이등을 각각 출력하는 방법은 없을 까. ?
		
		// 매개변수 2개인 생성자로 호출후, 동적으로 사용해보기.
		Animal ani4 = new Animal("ani4", 10);
		ani4.soundMethod();
		ani4.introduceMethod();
		
		
		

	}

}
