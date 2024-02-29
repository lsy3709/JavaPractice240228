package ex_240229;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class Ex_5_continue_test {

	public static void main(String[] args) {
		// 양수만 더하기.

		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("양수만 더하는 프로그램");
			System.out.println("1번: 양수만 더하는 프로그램 , 0번: 종료시 누르기 >>");
			int number = scanner.nextInt();

			// 조건문 분기
			if (number == 0) {
				System.out.println("프로그램 종료합니다.");
				
				// 사용 안하는 메모리는 반납을 꼭 해주기.
				scanner.close();
				break;
			} else {
			// number == 1 인경우, 양수만 5개 더하는 프로그램.
				continueAddEx();

			}
			
		}

	}

	// 숫자는 연속해서 5개 입력해주세요 
	// continue 활용
	
	// 디버깅, 자바, 자바스크립트, 파이썬, 여타 플러트등. 
	// 다른 프로그래밍 언어를 공부할 때, 코드를 분석한다. 
	// 방법) 1) 줄번호 더블 클릭 2) 중단점을 시작, 끝을 설정. 
	// 실행) f11 디버깅 모드, -> Perspective 모드에서 debug 모드
	// 진행 방식 ) f5 step into, 함수안에 들어가거나, 실행할 때 
	// 진행 방식2) f6 step over, 실행만하고 건너띄기.
	public static void continueAddEx() {
		Scanner scanner = new Scanner(System.in);
		// 숫자는 연속해서 5개 입력해주세요
		System.out.println("숫자는 연속해서 5개 입력해주세요 >>");
		int sum = 0;
		for(int i = 0 ; i < 5; i++) {
			int n = scanner.nextInt();
			if(n<=0) continue;
			else sum += n;
		}
		System.out.println("합은 : " + sum);

	}

}