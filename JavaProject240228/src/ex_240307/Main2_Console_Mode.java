package ex_240307;

import java.util.Scanner;

public class Main2_Console_Mode {

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
				break;
			} else if (checkNum == 1) {
				// 스포츠 등록하는 메서드 
				
			} else if (checkNum == 2) {
				// 스포츠 검색하는 메서드 
				
			} else {
				System.out.println("==========1 ~ 3번 숫자를 입력해주세요.===========");
				continue;
			}
			
		}

	}

}
