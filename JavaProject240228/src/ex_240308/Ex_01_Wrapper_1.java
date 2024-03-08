package ex_240308;

public class Ex_01_Wrapper_1 {

	public static void main(String[] args) {
		// Wrapper Class 는 기본형 -> 참조형, 변환 해주는 클래스다.
		// OOP(Object Oriented Programing)
		// 꽃 ? 상속, 재사용
		// 반환 타입이 -> Integer
		Integer i1 = Integer.valueOf(100);
		// i1. 찍어 보면, 보이는 시점이,1) Object도 보이고 
		// 2) Integer도 보임. 
//		i1.
		// 참조형을 출력해보니, 해당 기본형의 정수값인 : 100 이 출력됨. 
		// 왜? 참조형 -> 기본형, 자동 언박싱. 
		System.out.println("i1 : " + i1);
		Object i2 = Integer.valueOf(100);
		// i2. 찍어 보면, 보이는 시점이,1) Object 만 보임.  
//		i2.
		
		// 문자열(참조형) -> Wrapper(참조형)
		Integer i3 = Integer.valueOf("1000");
		System.out.println("i3 : " + i3);
		
		// 실수 , -> 통계 할 때, 평점, 4.3
		// -> 정확도, 일치도를 평가할 때, 소수점 7자리 ~ 15자리,
		// 3.14 의 기본형 double  이고, 
		// 작은 집인 float , 다운캐스팅. 
		 Float float1 = Float.valueOf((float)3.14);
		 System.out.println("float1 : " + float1);
		 
		 // 주요 많은 메서드들이 있지만, 그중에서 많이 사용이되는 
//		 Integer i4 = Integer.valueOf(100);
//		 int num = i4.parseInt("1000");
		 String num2 = "10000";
		 int num3 = Integer.parseInt(num2);
		 System.out.println("num3 : " + num3);
		

	}

}
