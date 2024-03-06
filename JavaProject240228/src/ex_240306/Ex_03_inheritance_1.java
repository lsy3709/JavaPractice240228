package ex_240306;

// 부모 클래스 
// 클래스 1) 정의.
class A2 {
	public A2() {
		System.out.println("생성자 A2 입니다.");
	}
}

class B extends A2 {
	public B() {
		System.out.println("생성자 B 입니다.");
	}
}

class C extends B {
	public C() {
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
