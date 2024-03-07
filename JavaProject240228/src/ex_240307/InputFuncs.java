package ex_240307;

import java.util.Scanner;

// 스포츠 해당 종목들이 각각의 인스턴스.
// Sports 라는 타입으로 배열을 선언을 해서.
// 이 배열의 요소로 담기. 
// 담아 놓은 배열에서, 검색을 하거나, 출력 하면 됨. 


public class InputFuncs {
	// 1. 스포츠 등록하는 기능.
	
	// 해당 등록하는 함수에, 입력 타입으로 스포츠 타입의 레퍼런스 변수(인스턴스)
	// 메서드 입력값 
	//들어갈 때는 , 빈 인스턴스가 들어가고,
	// 메서드 반환값
	// 나올때 는 , 인스턴스에 (콘솔에서 입력한 데이터를 ) 적용한 인스턴스가 나온다. 
	
	public static Sports enrollSports(Sports sports) {
		// 콘솔 입력을 받는 부분
		Scanner scanner = new Scanner(System.in);
		System.out.println("스포츠 종목명(문자열로) 입력해주세요>>:");
		String sportsName = scanner.next();
		
		System.out.println("인원수 숫자(정수로) 입력해주세요>>: ");
		int sportsMemberCount = scanner.nextInt();
		
		System.out.println("플레이 시간(문자열로) 입력해주세요>>: ");
		String sportsPlayTime = scanner.next();
		
		System.out.println("운동 장소 입력해주세요>>: ");
		String sportsPlayPlace = scanner.next();
		
		System.out.println("개막 시즌 입력해주세요(봄:1,여름:2,가을:3,겨울:4)>>: ");
		int sportsStartSeason = scanner.nextInt();
		
		System.out.println("실내:1, 실외:2 입력해주세요>> ");
		int sportsInOrOut = scanner.nextInt();
		
		System.out.println("대표 멤버 3명만 입력해주세요(공백을 기준으로 나란히 작성해주세요)>>: ");
		String [] members = new String[3];
		for(int i = 0; i<members.length; i++) {
			members[i] = scanner.next();
		}
		
		System.out.println("대표 사용장비 3개만 입력해주세요(공백을 기준으로 나란히 작성해주세요)>>: ");
		String [] items = new String[3];
		for(int i = 0; i<members.length; i++) {
			items[i] = scanner.next();
		}
		
		// 콘솔에서 입력 받은 데이터를, 우리가 만든 클래스에 적용하기. 
		
		
		return sports;
	}
	
	// 2. 스포츠 검색해서 출력하는 기능. 
}
