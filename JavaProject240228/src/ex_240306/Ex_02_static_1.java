package ex_240306;

class A {
	// 멤버, 인스턴스 변수
	public int number;
	// 클래스 변수, 전역으로 사용이됨. 
	static int commonNumber;
	// 생성자, 매개변수 1개인
	public A(int num) {
		this.number = num;
	}
	// 메서드, 
	public void showNumber() {
		System.out.println("A 클래스 number : " + this.number);
		
	}
	
	// 전역 변수 변경하는 메서드 .
	public void chageStaticValue() {
		commonNumber++;
	}
}

public class Ex_02_static_1 {

	public static void main(String[] args) {
		A a1 = new A(100); // 각각 가리키는 레퍼런스 참조값(메모리 위치 주솟값)
		a1.showNumber();
		A a2 = new A(200);
		a2.showNumber();
		System.out.println("=========================");
		
		// a1 인스턴스에 , 전역 변수에 접근해서, 값을 변경해보기.
		// 인스턴스로, 해당 클래스 변수에 접근이 가능하지만, 권장하지 않는다. 
		// 그래서, 컴파일러에서 경고를 표시한다. 
		// 원래는 해당 클래스명.전역변수로 접근함. 
		// 예) A.commonNumber
		a1.commonNumber = 1000;
		// a1 인스턴스에, 메서드를 이용해서, 전역 변수를 변경하는 기능을 이용. 
		

	}

}
