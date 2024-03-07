package ex_240307;

import java.util.Scanner;

public class Main2_Console_Mode {
	// 등록 받을 스포츠를 담을 배열을 만들기. 
	// 단점, 크기가 고정이 되어서, 늘리거나, 줄일수 없어요. 
	// 최초에 스포츠 등록 할 때, 갯수를 지정하기.
	static Sports [] sportsArray;

	public static void main(String[] args) {
		// 1. 스포츠 등록하기. 메서드로 만들기.
		while (true) {
			System.out.println("========Sports=========");
			System.out.println("해당번호 1 ~ 3번중 하나를 선택 해주세요.");
			System.out.println("1. 스포츠 등록하기.");
			System.out.println("2. 등록된 스포츠 검색해서 출력하기.");
			System.out.println("3. 종료하기.");
			
			// Scanner 이용하기. 
			Scanner scanner = new Scanner(System.in);
			int checkNum = scanner.nextInt();
			if (checkNum == 3) {
				System.out.println("종료합니다.");
				// 완전 종료시, 스캐너 인스턴스 메모리 반납하기.
				scanner.close();
				break;
			} else if (checkNum == 1) {
				// 스포츠 등록하는 메서드 
				System.out.println("스포츠 등록하기.");
				System.out.println("등록할 스포츠 갯수를 입력해주세요(1~5)>>");
				int sportsNumber = scanner.nextInt();
				sportsArray = new Sports[sportsNumber];
				
				InputFuncs inputSports = new InputFuncs();
				SubSports sports = null;
				Sports SubinputedSports = inputSports.enrollSports(sports);
				for(int i = 0 ; i <sportsArray.length; i++) {
					sportsArray[i] = SubinputedSports;
				}
				
				
			} else if (checkNum == 2) {
				// 스포츠 검색하는 메서드 
				System.out.println("스포츠 검색하기.");
				
			} else {
				System.out.println("==========1 ~ 3번 숫자를 입력해주세요.===========");
				continue;
			}
			
		}

	}

}
