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
		
//		System.out.println("while 문으로, 값의 존재 유무 확인 후, 다음 토큰 값 호출 메서드로 확인. ");
//		while(st.hasMoreTokens()) {
//			String nextString = st.nextToken();
//			System.out.println("nextString 출력하기. : " + nextString );
//		}
		showStringTokenizer(st);
		
		
		StringTokenizer st2 = new StringTokenizer(query,"&=");
//		System.out.println("while 문으로, 값의 존재 유무 확인 후, 다음 토큰 값 호출 메서드로 확인. ");
//		while(st2.hasMoreTokens()) {
//			String nextString = st2.nextToken();
//			System.out.println("nextString 출력하기. : " + nextString );
//		}
		showStringTokenizer(st2);
		
		String query3 = "\"apple\":\"사과\",\"banana\":\"바나나\",\"grape\":\"포도\"";
		System.out.println(query3);
		StringTokenizer st3 = new StringTokenizer(query3, ",");
		showStringTokenizer(st3);
		
		// 실무에서 많이 사용되는 중간 데이터 타입으로 json 형태 값 모양
		// get 방식으로 주소 호출시, 주소가 길지만, ? 다음으로 오는 파라미터 타입을 , 4세트 정도되니 모양 보시고, 
		// 
		// https://apis.data.go.kr/6260000/FoodService/getFoodKr?serviceKey=ALRX9GpugtvHxcIO%2FiPg1vXIQKi0E6Kk1ns4imt8BLTgdvSlH%2FAKv%2BA1GcGUQgzuzqM3Uv1ZGgpG5erOTDcYRQ%3D%3D&numOfRows=100&pageNo=1&resultType=json

	}
	
	// 전역 메소드, 입력 : StringTokenizer 타입 , 단순 출력만 하는 걸로. 
	public static void showStringTokenizer(StringTokenizer stringTokenizer) {
		System.out.println("while 문으로, 값의 존재 유무 확인 후, 다음 토큰 값 호출 메서드로 확인. ");
		while(stringTokenizer.hasMoreTokens()) {
			String nextString = stringTokenizer.nextToken();
			System.out.println("nextString 출력하기. : " + nextString );
		}
		
	}
	
	

}
