package ex_240308;

import java.util.StringTokenizer;

public class Ex_04_StringTokenizer_1 {

	public static void main(String[] args) {
		// query 의 형식은 HTML 의 웹브라우저에서 get 방식으로 서버에 전달하면.
		// 동적인 파라미터라고 함. 
		String query = "name=lsy&addr=busan&age=41";
		StringTokenizer st = new StringTokenizer(query,"&");
		
		// 분리된 문자열의 전체 갯수 구하기. 
		int n = st.countTokens();
		System.out.println("분리된 문자열의 전체 갯수  int n = st.countTokens()  : " + n );
		
		System.out.println("while 문으로, 값의 존재 유무 확인 후, 다음 토큰 값 호출 메서드로 확인. ");
		while(st.hasMoreTokens()) {
			String nextString = st.nextToken();
			System.out.println("nextString 출력하기. : " + nextString );
		}
		
		
		StringTokenizer st2 = new StringTokenizer(query,"&=");
		System.out.println("while 문으로, 값의 존재 유무 확인 후, 다음 토큰 값 호출 메서드로 확인. ");
		while(st2.hasMoreTokens()) {
			String nextString = st2.nextToken();
			System.out.println("nextString 출력하기. : " + nextString );
		}
		

	}

}
