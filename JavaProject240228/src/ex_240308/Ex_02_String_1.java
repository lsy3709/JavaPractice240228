package ex_240308;

public class Ex_02_String_1 {

	public static void main(String[] args) {
		// String, 참조형 , 클래스다. 
		// 메모리 소모가 심하다. 변경이 불가하다. 그래서, 생성한다. 
		// 이런 이유로 메모리 소모가 심하다. 
		// 관련 메서드들 확인. 
		// 선언 방식에 따라서, 리터럴 테이블에 저장해서, 공유 재사용을 할지 여부
		// 1) String str = "HELLO"; , 리터럴 테이블에 저장해서, 공유
		// 2) String str2 = new String("HELLO"); 힙 메모리 공간 어딘가에 계속 새롭게 생성. 
		// 각각 다 다릅니다. 
		String str = "HELLO";
		String str2 = "HELLO";
		System.out.println("str.hashCode : " + str.hashCode());
		System.out.println("str2.hashCode : " + str2.hashCode());
		
		// System.identityHashCode -> 메모리 위치 주소값을 확인 하는 용도로 사용하는 메서드.
		String str3 = new String("Hi");
		String str4 = new String("Hi");
		System.out.println("str3 System.identityHashCode : " + System.identityHashCode(str3));
		System.out.println("str4 System.identityHashCode : " + System.identityHashCode(str4));
		
		Object objStr3 = str3;
		Object objStr4 = str4;
		System.out.println("objStr3 System.identityHashCode : " + System.identityHashCode(objStr3));
		System.out.println("objStr4 System.identityHashCode : " + System.identityHashCode(objStr4));
		
		// concat 함수 확인. 문자열이 변경이 안되는 부분 확인. 
		// 새로 생성 하는 부분 
		String str3Concat = str3.concat(" world");
		String str4Concat = str4.concat(" world");
		System.out.println("str3Concat System.identityHashCode : " + System.identityHashCode(str3Concat));
		System.out.println("str4Concat System.identityHashCode : " + System.identityHashCode(str4Concat));
		
		//test 
		String str5 = new String("hello");
		String str6 = new String("hello");
		System.out.println("str5 System.identityHashCode : " + System.identityHashCode(str5));
		System.out.println("str6 System.identityHashCode : " + System.identityHashCode(str6));
		
		
		

	}

}
