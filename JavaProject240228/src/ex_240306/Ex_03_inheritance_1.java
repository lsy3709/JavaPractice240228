package ex_240306;

// 부모 클래스 
// 클래스 1) 정의.
class A2 {
	// 모든 클래스는 묵시적으로 Object 클래스를 상속 받고 있음.
	public A2(int x) {
		System.out.println("생성자 A2 입니다.");
	}
	// 디폴트 생성자를 컴파일러가 안만들어주니,
	 // 우리가 수동으로 만들기. 
	public A2() {
		// TODO Auto-generated constructor stub
	}
}

class B extends A2 {
	
	public B(int x) {
		// 첫번째 방법, 부모 클래스의 생성자에 타입 맞춤
		// 표현, 깔맞춤. 
//		super(x);
//		x = 0;
		super();
		
		
		 // 생략이 되어 있고, 묵시적
		System.out.println("생성자 B 입니다.");
	}
	
	// 기본 생성자 없어서, 아래의 클래스에서 오류가 남. 만들기. 
	public B() {
		// TODO Auto-generated constructor stub
	}
}

class C extends B {
	public C() {
		super(); // 생략이 되어 있고, 묵시적
		System.out.println("생성자 C 입니다.");
	}
}

public class Ex_03_inheritance_1 {

	public static void main(String[] args) {
		// 클래스 2) 사용
		C c = new C();
		System.out.println("부모 클래스 먼저 생성자 호출 확인.");
		// 디버깅 방법 
		// 1) 라인 번호 앞에 더블 클릭을한다. 브레이크 포인트 지정. 
		//예시 27번 라인 앞에 지정한다.
		// 2) 디버그 실행(모드), f11 -> Perspective , 오른쪽 상단에 벌레 모양 아이콘 으로 변경됨.  
		// step into, 메서드, 생성자 호출시 
		// 안으로 들어가기. f5 
		// step over, 단순 넘기기(skip) f6
		// 변수등을 넘어갈 때, 또는 메서드를 실행만
		//하고 넘어갈 때. 

	}

}
