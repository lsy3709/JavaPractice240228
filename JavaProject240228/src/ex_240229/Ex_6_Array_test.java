package ex_240229;

public class Ex_6_Array_test {

	public static void main(String[] args) {
		//배열, 크기 고정이고, 변경이 안됨. 
		// 비유, 계란판 비유. 같은 타입의 데이터만 담을수 있다. 
		// 배열 생성 방법
		// 1) int [] array ; 선언만 
		// 1)-2 array = new int[4] ; , 선언후 배열 생성(초기화를 한다표현함). 
		// 1)-3 int [] array2 = new int [5]
		// 1)-4 int array2 [] = new int [5]
		// 2) int array3 [] = {1,2,3}
		// 인덱스 시작, 0부터 시작, 순서가 있다. 
		// 선언시 int array [4] ; , 크기를 지정하면 안됨. 
		int array [] = new int[5];
		// 배열에 값을 설정
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		// 배열에 값을 불러오기 
		System.out.println("array[0]의 값 불러오기 : " + array[0]);
		
		// 선언과 동시에 값을 설정(초기화를 했다.), 크기 고정 : 5
		int array2 [] = {1,2,3,4,5};
		// 반복문으로 불러오기 
		for(int i = 0; i<array2.length; i++) {
			System.out.println("array[" + i + "] = " + array2[i] + " 입니다.");
		}
		
		// 문자열 배열 선언 해보기. 점심 메뉴 출력해보기. 
		String[] arrayLunchMenuString = {"김밥","국밥","우동","아구찜","된장찌개","비빔밥"};  
		System.out.println("============점심메뉴====================");
		for(int i = 0; i<arrayLunchMenuString.length; i++) {
			System.out.println("먹고 싶은 메뉴 목록 : " + arrayLunchMenuString[i] + " 입니다.");
		}
		

	}

}
