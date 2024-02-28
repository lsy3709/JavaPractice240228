package ex_240228;


class Person {
	private String userName;
	private String userEmail;
	
	public Person( String name, String email) {
		this.userName = name;
		this.userEmail = email;
	
	}
	// 춤추는 함수 
	public void doDance() {
		System.out.println("춤추기");
	}
	//  정보를 호출하는 함수.
	public void showInfo() {
		System.out.println("이름 : " + this.userName + " 메일 : " + this.userEmail);
		
	}
	
}

public class Ex_2_Variable {
	
	

	public static void main(String[] args) {
		// 변수 사용시 주의 사항
		// 1. 특수 문자는 _, $ , 언더바와 달러만 사용가능.
		// 2. 유니 코드, 한글 사용 가능하지만, 잘 사용안한다.
		// 3. 자바에서 예약어(키워드) 변수이름으로 사용불가
		// 4. 길이 제한 없지만, 의미 있게 이름 짓는다.

		// 숫자 시작 안됨. 보여주고 주석 합니다.
		// int 12d ;
		int 학번;
		// 예약어는 컴파일러 오류가(문법검사)
		// String class;
		// int !num;
		// 첫 문자를 특수 문자로해서 잘 사용하지 않는다.
		int _num;
		// 대문자와, 소문자를 구분함.
		int num2;
		int NUM2;

		byte byte1 = 127;
		// 각 정수형 타입에서, 1바이트, 2바이트, 4바이트, 8바이트
		// 각 정수형의 데이터 범위의 구간을 구지 다 외울 필요없다.
		// 10진수 가 뭔지, 2진수가 뭔지 구분만 해주면 될듯.
		// 예) 10진수, 10 , 이진수 : 0000 1010
//		byte byte2 = 128;

		// 자바에서 데이터 타입, 1) 기본형 8개 2) 참조형
		// byte 1바이트, short 2바이트 , int 4바이트 (기본), long 8바이트 :정수형
		// float, Double : 실수형, 지수와 가수 어려운이야기,
		// 소숫점으로 정밀하게 측정해야하는 데이터 타입에 사용이됨.
		// 공학 에 관련된 내용, 빅데이터 관련 통계에서 정확도를 측정시
		// char, boolean

		// 기본형 데이터 타입을 제외한 , 나머지 타입이 레퍼런스 타입이다. ( 클래스, 인터페이스, 배열 등)

		// 문자열 + 숫자 = 문자열, 연결 연산자

		// 같은 타입의 변수를 연속해서 나열 가능.
		int i1, i2, i3;

		// 각 진수 표기법
		int num1 = 10;
		System.out.println("num1 : " + num1);
		// 이진수 표기법, 0b , 예) 0b1001
		int number2 = 0b1010;
		System.out.println("number2 : " + number2);

		// 8진수 표기법, 숫자 영만 붙이기 예) 012 ->10 의미
		// 1 x 8^1 , 2 x 8^0
		int number3 = 012;
		System.out.println("number3 : " + number3);

		// 16진수 표기법, 숫자 영에 x 붙이기 예) 0x12 ->10 의미
		// 0 ~ 9, a(10), b(11), c(12) ,d(13) , e(14), f(15)
		// 1 x 8^1 , 2 x 8^0
		int number4 = 0xa;
		System.out.println("number4 : " + number4);
		
		// long , 정수형 
		long number5 = 1000000000000000000l;
		// float , 실수형 
		float number6 = 1.2345f;
		// Double , 실수형 
		double number7 = 1.12345678901234567890123456789012345678901234567890;
		// boolean , true, false 
		boolean isChecked = false;
		
		//레퍼런스 타입으로 선언하기. 
		// 클래스명 참조형 변수 이름 = new(키워드) 클래스생성자(매개변수가2개인 생성자 호출.)
		// lsyPerson : 참조형 변수(레퍼런스 변수), 클래스에서, 인스턴스를 생성했다.
		Person lsyPerson = new Person("이상용", "lsy@naver.com");
		lsyPerson.doDance();
		lsyPerson.showInfo();
		
		// 특수 문자 출력 해보기. 
		System.out.println("특수 문자 \b : " + '\b' );
		// 그나마 쓰는 이스케이프 문자 
		System.out.println("특수 문자 \t : " + '\t' + "샘플" );
		System.out.println("특수 문자 \n : " + '\n' + "샘플" );
		System.out.println("특수 문자 \f : " + '\f' + "샘플" );
		System.out.println("특수 문자 \r : " + '\r' + "샘플" );
		// 그나마 쓰는 이스케이프 문자 
		System.out.println("특수 문자 \" : " + '\"' + "샘플" );
		System.out.println("특수 문자 \\ : " + '\\' + "샘플" );
		
		// null, 아무것도 없다라고 표현도 하는데, 레퍼런스가 할당이 안되었다. 
		// 기본형에서 사용 안함. 
		String strTest = null ;

		// int testNumber = null;
		
		// 상수 , final , 변하지 않는다. 즉, 재할당 안된다. 
		final int finalNumber = 0;
		// finalNumber = 2;
		
		// var 동적 변수 할당 부분은 잠시 대기, 현재는 타입을 지정해서 선언하는 방식으로 연습. 
		// 그래서 패스 
		
		// 타입 변환, 캐스팅( 던진다), 
		// 작은 집 -> 큰집으로 갈 때, 문제가 없다. 
		// 큰 집 -> 작은 집으로 갈 때, 문제가 있고, 값의 손실이 발생이 한다. 기본형. 
		byte byteNumber1 = 10;
		long longNumber1 = byteNumber1;
		System.out.println("타입 변환 테스트 작은 집 -> 큰 집 갈경우(longNumber1) : "+ longNumber1);
		
		// 큰 집 -> 작은 집 갈 경우 . 문제가 발생, 문법 검사기 걸렸음. 
		// 강제로 형을 변환을 하기 위해서, 연산자, 캐스팅 연산자, 예) (강제로 변환할 형) 변수
		// 개념적인 이야기이고, 실무에서는 사용을 안한다.
		int intNumber2 = 130;
		byte byteNumber2 = (byte)intNumber2;
		System.out.println("타입 변환 테스트 큰 집 -> 작은 집 갈경우 강제로 형변환");
		System.out.println("byteNumber2 : " + byteNumber2);
		
		// 레퍼런스에서는 , 포함관계로 설명을 하는데, 상속에 대해서 설명 후 구체적으로 하기
		// 부모 클래스, 자식 클래스 개념이 나오고, 
		// 자식 타입 -> 부모 타입 변경하거나
		// 부모 타입 -> 자식 타입 변경하거나 
		
	}

}





