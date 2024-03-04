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
		// setter 이용해서 값을 설정
		koreanPizza.setName("부추전");
		koreanPizza.setRadius(15);
		// 메서드를 이용해서, 정보를 접근.
		koreanPizza.showInfo();

		// getter를 이용해서 해당 정보 접근.
		System.out.println("getter 이용해서, 멤버 접근 하기. name: " + koreanPizza.getName());
		System.out.println("getter 이용해서, 멤버 접근 하기. radius: " + koreanPizza.getRadius());

		// 김치전
		Circle kimchiPizza = new Circle(20, "김치전");
		kimchiPizza.calcGetArea();
		kimchiPizza.showInfo();

		// 감자전
		Circle koreanPotatoPizza = new Circle(20, "감자전",15000);
		koreanPotatoPizza.calcGetArea();
		koreanPotatoPizza.showInfo();
		System.out.println("==================================");

		// 배열에, 담을 타입을 , 레퍼런스 형으로 변경.
//		Circle[] koreanPizzas = new Circle[5];
//		koreanPizzas[0] = koreanPizza;
//		koreanPizzas[1] = kimchiPizza;
//		koreanPizzas[2] = koreanPotatoPizza;
//		koreanPizzas[3] = new Circle(10, "육전", 20000);
//		koreanPizzas[4] = new Circle(15, "명태전", 10000);;
		
		// 배열을 선언과 초기화를 하는 방법2 
		Circle[] koreanPizzas = {koreanPizza,kimchiPizza,
				koreanPotatoPizza,
				new Circle(10, "육전", 20000),new Circle(15, "명태전", 10000)};
		
		// 반복문을 이용해서, 배열에 담은 Circle 타입의 레퍼런스에 각각 접근해서, 
		// showInfo() 호출 해보기. 
		// for ~ each 문법 : for ( 담을 변수 타입 변수명 : 컬렉션(배열)) 
		for( Circle koreanFood : koreanPizzas) {
			koreanFood.showInfo();
		}
		
	}

}


