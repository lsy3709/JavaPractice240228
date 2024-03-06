package ex_240306;

public class Ex_05_interface_main_1 {

	public static void main(String[] args) {
		// 인터페이스를 구현한 자식 클래스를 사용.
		// 자식 클래스 타입   레퍼런스 변수 명   =  new   자식 클래스 타입();
		Ex_05_interface_subClass_1 test1 = new Ex_05_interface_subClass_1();
		test1.introduceInfo();
		test1.showInfo();
		System.out.println(" test1.MAX : " + test1.MAX);
		// private 메서드 호출을 , 외부에서 볼수가 없으니, 해당 인터페이스에 
		// 메서드 안에, private 메서드를 호출하는 것을 넣기. 
		
		
		// 다형성 , 업캐스팅, 다운 캐스팅. 
		// 문법 : 마치, 상속에서, 업캐스팅 하는 것과 동일함.
		// 결론, 자식 클래스가 구현한 인터페이스로 , 받는 타입으로 사용이 가능함, 마치 업캐스팅 처럼. 
		// 인터페이스 명   레퍼런스 변수 명   =  new   자식 클래스 타입();
		Ex_05_interface_1 test2 = new Ex_05_interface_subClass_1();
		
		

	}

}
