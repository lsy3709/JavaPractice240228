package ex_240307;

import java.util.Scanner;

public class InputFuncs {
	// 1. 스포츠 등록하는 기능.
	public static void enrollSports() {
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
		
		
	}
	
	// 2. 스포츠 검색해서 출력하는 기능. 
}
