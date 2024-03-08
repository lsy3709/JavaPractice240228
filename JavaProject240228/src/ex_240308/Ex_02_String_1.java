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
		System.out.println("str System.identityHashCode : " + System.identityHashCode(str));
		System.out.println("str2 System.identityHashCode : " + System.identityHashCode(str2));

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
		System.out.println("str3.concat(\" world\") : " + str3.concat(" world"));
		System.out.println("str4.concat(\" world\") : " + str4.concat(" world"));
		System.out.println("str3Concat System.identityHashCode : " + System.identityHashCode(str3Concat));
		System.out.println("str4Concat System.identityHashCode : " + System.identityHashCode(str4Concat));

		// test
		String str5 = new String("hello");
		String str6 = new String("hello");
		System.out.println("str5 System.identityHashCode : " + System.identityHashCode(str5));
		System.out.println("str6 System.identityHashCode : " + System.identityHashCode(str6));

		// equals, 문자열 비교하기.
		// 주의사항, 정수 비교 하듯이 "==" 등위 연산자를 사용하면 안됩니다.
		String str7 = new String("hello1");
		String str8 = new String("hello2");
		String str9 = new String("hello1");
		System.out.println("str7.equals(str8) 비교 : " + str7.equals(str8));
		System.out.println("str7.equals(str9) 비교 : " + str7.equals(str9));

		// charAt(int index) : 해당 인덱스에 있는 문자 리턴
		String str10 = "HELLO";
		String str11 = "HOUSE";
		char char1 = str10.charAt(3);
		System.out.println("char1 : " + char1);
		System.out.println("str10.charAt(3) : " + str10.charAt(3));
		System.out.println("\"HELLO\".charAt(3) : " + "HELLO".charAt(3));
		System.out.println("=================================");

		// codePointAt(int index) : 해당 인덱스에 있는 유니코드값 리턴
		System.out.println("str10.codePointAt(3) : " + str10.codePointAt(3));

		// compareTo(String anotherString) :
		// 두 스트링을 사전적 순서를 기준으로 비교,
		// 같으면 0, 현재 스트링이 비교 스트링보다 먼저 나오면(결론적으로 작다
		// HELLO , HOUSE , E(5번째) O(15번째) =>음수,
		// 나중에 나오면 양수,
		System.out.println("str10.compareTo(str11) : " + str10.compareTo(str11));
		System.out.println("str11.compareTo(str10) : " + str11.compareTo(str10));
		System.out.println("str10.compareTo(str10) : " + str10.compareTo(str10));

		// contains , 찾기 기능을 구현할 때, 이용할려고 했던 메서드
		// boolean contains(CharSequence s) : s에 지정된 문자들을 포함하고 있으면 리턴.
		System.out.println("str10.contains(\"H\") : " + str10.contains("H"));
		System.out.println("str10.contains(\"HL\") : " + str10.contains("HL"));
		System.out.println("str10.contains(\"Hello\") : " + str10.contains("Hello"));
		System.out.println("str10.contains(\"HELL\") : " + str10.contains("HELL"));
		System.out.println("str10.contains(\"HELOL\") : " + str10.contains("HELOL"));
		System.out.println("str10.contains(\"H,E,L,L,O\") : " + str10.contains("H,E,L,L,O"));
		System.out.println("str10.contains(\"HELOL\") : " + str10.contains("HELLO"));

		// 응용 검색 기능. 임시 더미 디비
		// apple 검색해보기. 
		System.out.println("apple 검색해보기. : " + searchFruit("bananea"));
		
		// length : 문자열의 길이 리턴. 
		System.out.println("HELLO length : " + str10.length());
		
		// replace(Charsequence target, Charsequence replacement) 
		// : 목표 문자열을, 변경할 문자열로 대체하기.
		System.out.println("str10.replace(\"HE\", \"PI\") : " + str10.replace("HE", "PI"));
		System.out.println("str10.replace(\"HELLO\", \"PILLOW\") : " + str10.replace("HELLO", "PILLOW"));
		
		// String[] split(String regex) : 정규 regex에 일치하는 부분을 중심으로 문자열 분리하기.
		String str12 = "H,E,L,L,O";
		String [] resultArray1 = str10.split("");
		String [] resultArray2 = str12.split(",");
		showArray(resultArray1);
		showArray(resultArray2);
		
		//String subString(int beginIndex) : beginIndex부터 시작되는 문자열을 반환.
		
		//String subString(int beginIndex, int lastIndex)
		// : beginIndex부터 lastIndex (미만)까지 문자열을 반환.
		System.out.println("str10.substring(2) : " + str10.substring(2));
		System.out.println("str10.substring(1,3) : " + str10.substring(1,3));
		
		// String trim() : 문자열 앞뒤의 공백을 제거함. 
		String str13 = "   HELLO   ";
		System.out.println("str13 : HELLO " + str13);
		System.out.println("str13 :    HELLO    " + str13.trim());
		System.out.println("str13.length() : " + str13.length());
		System.out.println("str13.trim().length() : " + str13.trim().length());

		// 응용 1) 검색시, 복붙을 하는데, 공백이 섞여 있음. 
		// 대소문자 상관없이 등 검색할 때, 
		// 입력된 문자열이, 
		// 응용 2) 입력된 파일의 확장자를 기준으로, 이미지 파일의 종류를 분리
		// abc.jpg, def.png, ghi.jpeg, abcd.MOV, efgh.mp4
		// 예) 게시글 작성치 첨부 파일로, 사진도 업로드, 영상도 업로드 
		// 내가 올린 게시글을 출력시, 이미지 로딩, 영상으로 로딩을 할지 분리. 
		
		

	}
	
	// 배열의 요소를 출력 해주는 메서드 
	public static void showArray(String[] array) {
		System.out.println("==============배열 출력하는 기능 호출됨==============");
		for(String string :array) {
			System.out.println(string);
		}
		
	}
	
	
	// 실무에서는, 
	// 화면에 검색 키워드를 전달하면. (프론트)
	// 메서드에 입력값에 키워드를 디비로 전달하고,(벡엔드) 
	// DB : select 구문에서 LIKE 절에서, 해당 내용이 있는지 검색. true, false (디비서버)
	// 해당 내용을, 다시 화면으로 전달. 
	
	// 검색하는 메서드 만들기. 생자바로 표현.
	public static String searchFruit(String search) {
		// 응용 검색 기능. 임시 더미 디비
		// 원래, 검색 기능을 이용시, 해당 디비에 접근을 해서, 해당 내용이 있는 지 유무를 확인. 
		// 성공 유무를 체크하는 변수 
		int resultCheck = 0;
		String resultSuccesString ="";
		String resultFailString ="";
		String [] fruitArray = {"apple", "banana", "grape"};
		for(int i = 0 ; i < fruitArray.length; i++) {
			if(search.contains(fruitArray[i])) {
				resultSuccesString = fruitArray[i];
				resultCheck = 1;
			} else {
				resultFailString = "검색된 키워드가 존재하지 않습니다.";
			}
		}
		if(resultCheck == 1) {
			return resultSuccesString;
		} else {
			return resultFailString;
		}
		

}
}
