package ex_240308;

public class Ex_03_StringBuffer_1 {

	public static void main(String[] args) {
		String str3 = new String("HELLO");
		String str4 = new String("HELLO");
		String str3Concat = str3.concat(" world");
		String str4Concat = str4.concat(" world");
		System.out.println("str3.concat(\" world\") : " + str3.concat(" world"));
		System.out.println("str4.concat(\" world\") : " + str4.concat(" world"));
		System.out.println("=======str3,str4======기존 문자열의 메모리 위치값==");
		System.out.println("str3 System.identityHashCode : " + System.identityHashCode(str3));
		System.out.println("str4 System.identityHashCode : " + System.identityHashCode(str4));
		System.out.println("=======str3,str4======합친 문자열의 메모리 위치값==");
		System.out.println("str3Concat System.identityHashCode : " + System.identityHashCode(str3Concat));
		System.out.println("str4Concat System.identityHashCode : " + System.identityHashCode(str4Concat));
		
		System.out.println("==========================");
		// 문제점을 개선한, StringBuffer를 활용해보기. 
		// 테스트 : 기존 문자열에 붙이는 concat 메서드 이용해서. 
		// 기존 사용하던 메모리 위치 주솟값을 계속 활용 하는지 여부.
		StringBuffer str1 = new StringBuffer("HELLO");
		
		System.out.println("HELLO 에 뒤에 붙이기 전 주소값 : 확인");
		System.out.println("str1 "
				+ "System.identityHashCode: " + System.identityHashCode(str1));
		
		str1.append(" world");
	
		
		System.out.println("str1.append(\" world\") : " + str1);
		System.out.println("HELLO 에 뒤에 붙이기 후 주소값 : 확인");
		System.out.println("str1.append(\" world\")  "
				+ "System.identityHashCode: " + System.identityHashCode(str1));
		
		
		// 메서드 기능 간단히 확인.
		// 012345678910
		// HELLO world
		str1.insert(5, " my");
		// StringBuffer에 따로 toString이 정의가 되어서, 바로 인스턴스 변수로 출력이 가능함. 
		System.out.println("str1.insert(5, \" my\") : " + str1);
		
		// 결과 문자열 
		// 01234567891234
		// HELLO my world
		
		str1.replace(1, 5, "i");
		System.out.println("str1.replace(1, 5, \"i\") : " + str1);

	}

}
