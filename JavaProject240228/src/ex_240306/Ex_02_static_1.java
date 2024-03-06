package ex_240306;

class A {
	// 멤버, 인스턴스 변수
	public int number;
	
	// 멤버, 인스턴스 변수
	public String name;
	
	// 클래스 변수, 전역으로 사용이됨.
	static int commonNumber;

	// 생성자, 매개변수 1개인
	public A(int num, String name) {
		this.number = num;
		this.name = name;
	}

	// 메서드,
	public void showNumber() {
		System.out.println(this.name + ", number : " + this.number);
		System.out.println(this.name + ", commonNumber : " + commonNumber);

	}

	// 전역 변수 변경하는 메서드 .
	public void chageStaticValue() {
		commonNumber++;
	}
}

public class Ex_02_static_1 {

	public static void main(String[] args) {
		A a1 = new A(100,"a1"); // 각각 가리키는 레퍼런스 참조값(메모리 위치 주솟값)
		a1.showNumber();
		A a2 = new A(200,"a2");
		a2.showNumber();
		System.out.println("=========================");

		// a1 인스턴스에 , 전역 변수에 접근해서, 값을 변경해보기.
		// 인스턴스로, 해당 클래스 변수에 접근이 가능하지만, 권장하지 않는다.
		// 그래서, 컴파일러에서 경고를 표시한다.
		// 원래는 해당 클래스명.전역변수로 접근함.
		// 예) A.commonNumber
		//	a1.commonNumber = 1000;
		A.commonNumber = 1000;
		
		// a1 인스턴스에, 메서드를 이용해서, 전역 변수를 변경하는 기능을 이용.
		a1.showNumber();
		// a1 인스턴스에 있는 전연변수를 변경하는 함수를 호출하기. 
		a1.chageStaticValue();
		// 확인. 
		a1.showNumber();
		
		// a2 인스턴스에, 숫자 조회. 
		a2.showNumber();

		// 결론, 
		// 해당 클래스에서 static 으로 전역으로 선언하면,
		// 다른 인스턴스에서, 해당 전역 변수에 접근시 해당 데이터 가 공유가 됨. 
		// a1 에서 전역변수를 변경하고, 
		// 다른 인스턴스인 a2 에서 접근을 하니, 전역변수가 변경됨을 확인함. 
		
		// 만약, 1) 인스턴스 변수로 , 해당 클래스 변수에 접근이 가능
		// 2) 반대로 불가능. 클래스 변수로는 인스턴수 변수에 접근이 불가. 
		//, 인스턴스는 각각의 고유한 독립값. 
		// 클래스변수는, 해당 클래스가 로더에 의해서, 로드가 되면, 그 때, 존재하는 변수(전역변수)
		// int a12 = a1.commonNumber; //  1) 가능. 
		// int a23 = A.a1.number; // 2) 불가능. 
	
		
	}

}
