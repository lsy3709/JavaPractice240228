package ex_240228;

import java.util.Scanner;

public class Ex_5_Operator2 {

	public static void main(String[] args) {
		System.out.println("전위 및 후위 연산자 확인 해보기. ");
		int a = 1;
		// a의 값을 먼저 1증가 시키고, 그 다음에 b에 할당.
		int b = ++a;
		System.out.println("a : " + a + ", b : " + b);
		
		int a2 = 1;
		// b에 할당 먼저, 그다음에 a의 값을 1증가 시키고
		// for( i = 0 ; i < list.size , i++)
		int b2 = a2 ++;
		System.out.println("a2 : " + a2 + ", b2 : " + b2);
		
		// char 값, 유니코드 
		char charTest1 = 'a';
		char charTest2 = 'b';
		int charTest1ToInt = charTest1;
		int charTest2ToInt = charTest2;
		System.out.println("char \'a\' 에 해당하는 유니코드 값 십진수 표현 : " + charTest1ToInt );
		System.out.println("char \'b\'에 해당하는 유니코드 값 십진수 표현 : " + charTest2ToInt );
		
		// 삼항 다항식 
		int x = 10;
		int y = 12; 
		// (조건식) ? (참일때 실행할 문장) : (거짓일때 실행할 문장) 
		int result = (x>y) ? x : y;
		System.out.println("result : " + result);
		
		if(x>y) {
			System.out.println("result : " + x);	
		} else {
			System.out.println("result : " + y);
		}
		
		

	}

}
