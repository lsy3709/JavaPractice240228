package ex_240304;

public class Ex_04_class_1_Circle {

	public static void main(String[] args) {
		// 클래스 사용. 
		// 클래스명 레퍼런스 변수 = new 클래스명();
		// 클래스명() = 디폴트 생성자. 
		// 생성자를 호출한다. 
		
		Circle koreanPizza = new Circle();
		// 클래스 필드의 접근 지정자가, public 이면 보여서, 접근이 가능함. 
//		koreanPizza.radius = 10;
//		koreanPizza.name = "김치전";
		// 안보이네 , 그러면 어쩔? setter/ getter 로 접근이 가능한 매개체를 만들기. 
		// 클래스에서 만들기. 
		koreanPizza.setName("부추전");
		koreanPizza.setRadius(15);
		koreanPizza.showInfo();
		
				

	}

}
