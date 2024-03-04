package ex_240304;

public class Ex_06_class_1_callByValue {

	public static void main(String[] args) {
		// 메서드 안에서의 변수는 지역변수라서, 효력범위를 , 수행 후 소멸 부분 재 확인. 
		// call by value , 해당 기본값을 복사해서, (원본 복사) , 지역변수 소멸 했다면.
		int n = 10;
		
		Circle circle = new Circle(n);
		
		circle.increase(n);
		
		System.out.println("변수 n 의 변화가 없는 부분 확인 하기 : " + n); //10 출력. 
		
		// call by referece , 참조형변수, (얕은 복사 생각하면되기) 바로가기. 
		
		Circle c1 = new Circle(5);
		// c1 이라는 인스턴스의 멤버에서, radius 라는 값은 : 5로 할당이 됨. 
		// c1 이 바라보는 메모리 위치 주솟값 : 예를 들어 0x100이라고 한다면, 
		System.out.println("c1 의 c1.radius 값 조회 : " +  c1.getRadius());
		
		// 메서드에, 인자 값으로 레퍼런스 타입을 전달을 함. 
		increase2(c1);
		
		System.out.println("increase2 메서드 호출 후 값 확인. c1 의 c1.radius 값 조회 : " +  c1.getRadius());

	}
	
	public static void increase2(Circle c100) {
		// Circle c100 = c1
		// c100 도 어디를 가리키나? 0x100
		// 0x100에 위치한 값을 변경을 하니, 
		// c1 도 영향을 받나요, 안 받나요? 받죠? 받아요. !!
		c100.setRadius(200); ;
		
	} 

}
