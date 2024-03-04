package ex_240304;

import test2.Shape_otherPackage;

public class Ex_05_class_1_Shape {

	public static void main(String[] args) {
		// 자식 클래스에서, 부모 클래스의 접근 지정자가 protected 이면 보인다. 확인. 
		Triangle tri1 = new Triangle();
		int protecedVarString = tri1.edgePoint;
		
		// 자식 클래스가 아니예요. 상속을 안받았고, 그래서, protected 안 보인다. 확인.
		Rectangle rec1 = new Rectangle();
//		rec1.
		
		// 다른 패키지에 있는 파일을 불러오기. 
		// 단축키 : 자동 import, ctrl + shift + o 
		// 나중에, 인텔리제이 관련 IDE 쓰면, 옵션, 자동 임포트 가 됩니다. 
		
		Shape_otherPackage shape_otherPackage = new Shape_otherPackage();
		// 다른 패키지에 있는 디폴트 접근 지정자는 안보인다. 
//		shape_otherPackage.
		

	}

}
