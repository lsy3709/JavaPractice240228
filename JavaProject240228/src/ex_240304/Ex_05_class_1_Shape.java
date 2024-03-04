package ex_240304;

public class Ex_05_class_1_Shape {

	public static void main(String[] args) {
		// 자식 클래스에서, 부모 클래스의 접근 지정자가 protected 이면 보인다. 확인. 
		Triangle tri1 = new Triangle();
		int protecedVarString = tri1.edgePoint;
		
		// 자식 클래스가 아니예요. 상속을 안받았고, 그래서, protected 안 보인다. 확인.
		Rectangle rec1 = new Rectangle();
//		rec1.
		

	}

}
