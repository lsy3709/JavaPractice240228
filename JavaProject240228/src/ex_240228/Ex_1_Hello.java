package ex_240228;

public class Ex_1_Hello {
	
	// public: (접근지정자) 모든 위치에서 접근이 가능. 
	// static : (전역처럼 사용이됨) 클래스 메소드(함수), 매개변수 2개이고, 리턴값도 있다(리턴타입 존재)
	// int : 리턴타입, sum 메소드를 수행후 결과값의 반환 타입. 
	// sum : 메소드 명, 
	// (int a, int b), 매개변수이다, 변수명은 임의로 작성가능. 
	// 이 메소드는 해당 클래스가 , 로더: 클래스를 불러오는 역할. 
	// 실행시, 해당 static 붙은 메소드 , 변수등은 , 시스템에 불러와져 있어서, 
	// 클래스명으로 바로 사용 가능. 
	// return , 결과값을 의미. 
	// 메소드가 정의가 된 부분. 
	public static int sum(int a, int b) {
		return a + b;
	}

	// void : 리턴값이 없다는 뜻 
	// main : 메소드 명 
	// (String[] args) : 매개변수 정의 부분, 타입이 배열로 정의가 되어 있음. 
	// String[] , 배열인데, 타입이 : String (문자열), vs 한문자 의미 (char)
	// main 메소드는 자바의 프로그램의 시작을 의미. 
	public static void main(String[] args) {
		// 뼈때 코드, 그냥 넘어가도 괜찮은 듯. 귀찮으면 지워도 무관. 
		// TODO Auto-generated method stub
		// 변수타입 변수명 = 값; 
		// 변수 타입, 크게 2가지 , 1) 기본형,  2) 레퍼런스 타입.(기본형을 제외한 나머지 모든 타입)
		// 변수 를 선언과 할당 동시에 진행
		int i = 20; 
		// 변수를 선언 따로, 
		int i2;
		// 변수에 값 할당 따로 진행. 
		i2 = 3;
		char a = 'a'; // 한문자를 표기시 사용, 사용하는 기호는 작은 따옴표를 사용함. 
		String str = "이상용"; // 문자열 표기시 사용, String 기본형이 아니다, 참조형이다. 큰 따옴표 사용. 
		
		int resultNum = sum(100,200); //sum
		// 출력해보기. 
		System.out.println("출력 연습: 단축키 : syso, ctrl + space 입력");
		System.out.println("i 값 : " + i); // 문자열 + 숫자 : + 연결 연산자
		System.out.println("실행 단축키 : ctrl + f11");
		System.out.println("==================================");
		System.out.println("===>여기서는 반복되니 복붙 했음. ");
		System.out.println("저장, 수동, ctrl + s, 수시로 입력하기.  ");
		System.out.println("i2 값 : " + i2);
		System.out.println("a 값 : " + a);
		System.out.println("str 값 : " + str);
		System.out.println("resultNum 값 : " + resultNum);
		

	}

}





