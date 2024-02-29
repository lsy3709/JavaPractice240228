package ex_240229;

import java.util.Scanner;

public class Ex_4_Nestedfor {

	public static void main(String[] args) {

		// 입력받은 수까지, 구구단 출력하기. (1~9) 숫자 하나 정하기.

		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("입력받은 수까지, 구구단 출력하는 프로그램");
			System.out.println(" 숫자를 입력해주세요, 0번: 종료시 누르기 >>");
			int number = scanner.nextInt();

			// 조건문 분기
			if (number >= 1) {
				// 입력 받은 수로 구구단 출력하기
				gugudan(number);
			} else if (number == 0) {
				System.out.println("프로그램 종료합니다.");
				// 사용 안하는 메모리는 반납을 꼭 해주기.
				scanner.close();
				break;
			} else {
				System.out.println("1-9 또는 0번중에서 입력해주세요.");
			}

		}

	}

	// 입력받은 수까지, 구구단 출력하기
	// 중첩  for 문 활용하기. 
	public static void gugudan(int number) {
		for(int i = 1; i<=number; i++) {
			for(int j = 1; j<10; j++) {
				System.out.print(i + "x" + j + "=" + i*j);
				System.out.print('\t');
			}
			System.out.println(); // 한단 끝나면 줄넘김. 
		}
		

	}

}








