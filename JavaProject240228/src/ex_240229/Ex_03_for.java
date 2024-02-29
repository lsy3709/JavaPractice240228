package ex_240229;

import java.util.Scanner;

public class Ex_03_for {

	public static void main(String[] args) {
		// while문은 보통은 무언가 계속 실행하게 하고, 
		// 특정 조건에서 빠져 나올 때 많이 사용한다. 
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("입력한 수 n 까지 더하는 프로그램");
			System.out.println(" 숫자를 입력해주세요, 0번: 종료시 누르기 >>");
			int number = scanner.nextInt();
			
			// 조건문 분기
			if (number >= 1) {
				int result = sumN(number);
				System.out.println("결과는 : " + result);
			} else if (number == 0) {
				System.out.println("프로그램 종료합니다.");
				// 사용 안하는 메모리는 반납을 꼭 해주기.
				scanner.close();
				break;
			} else {
				System.out.println("양수 또는 2번중에서 입력해주세요.");
			}
			
			
		}
		
	}
	// 입력한 수 n 까지 더하는 프로그램 만들기 : 1+2+3+...+n 
	public static int sumN(int number) {
		// 초깃값, 합의 값을 할당. 
		int i,sum = 0;
		for(i=0; i<=number; i++) {
			sum += i;
		}
		return sum;
		
	}

}
