package ex_240229;

import java.util.Scanner;

public class Ex_09_Array_test5_ {

	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("양수 5개로 자동생성, 최소,최대,평균,총합 프로그램");
			System.out.println("1번: 프로그램 자동실행 , 0번: 종료시 누르기 >>");
			int number = scanner.nextInt();

			// 조건문 분기
			if (number == 0) {
				System.out.println("프로그램 종료합니다.");

				// 사용 안하는 메모리는 반납을 꼭 해주기.
				scanner.close();
				break;
			} else {
				// number == 1 인경우, 양수만 5개 더하는 프로그램.
				// 자동으로 5개 양수값을 갖는 배열 만드는 함수 호출
				int array[] = new int[5];
				// 만들어진 배열을, 집계하는 함수를 호출
				showAggregation(array);
			}

		}

	}

	// 메서드 정의를 하고, 매개변수에 배열 타입으로 정의 했음. 
	// 그래서, 함수를 호출할 때, 인자값으로 배열을 전달이 가능함. 
	// 전달시, 메모리 위치 주소값을 전달 = 레퍼런스 변수 = 참조형 변수 = 인스턴스 전달. 
	public static void showAggregation(int[] intArray) {
		// 나중에 출력하기 위한 준비물
		int max = 0;
		int min = 0;
		int temp = 0;
		int sum = 0;
		int avg = 0;

		for (int i = 0; i < intArray.length; i++) {
			// 자동으로 0이상 100미만의 랜덤한 숫자 넣기로 변경. 
			intArray[i] = (int)(Math.random()*100 +1);
			min = intArray[0];
			// 최대값

			if (intArray[i] > max) {
				max = intArray[i];
			}
			// 최솟값 , 구하기, gpt 활용.
			// 배열의 첫 번째 요소를 초기 최솟값으로 설정

			else if (intArray[i] < min) {
				min = intArray[i]; // 현재까지의 최솟값보다 작은 값이 나오면 최솟값을 업데이트
			}

			// 총합
			sum += intArray[i];

		}
		// 배열에서 정렬 기능이 없어서 패스 함.
		// 최소값, 배열을 정렬 후,(오름차순으로 정렬하고, 첫번째 요소가 가장 작은 요소가 됨.)
		for(int i = 0 ; i < intArray.length; i++) {
			System.out.print(intArray[i]+" ");
		}
		System.out.println("=======================");
		System.out.println("최댓값 : " + max + ", 최솟값 : " + min);
		System.out.println("합계 : " + sum + ", 평균 : " + sum / intArray.length);

		// 2번, 자주 반복적으로 사용하는 함수로 만들어 보기.
		// 배열의 요소의 크기는 임의로 5개로 고정 하고,
		// 0이상 100 미만의 양수 중에서, 랜덤으로 5개 선택해서, 배열에 담아서,
		// 최대, 최소, 평균, 총합을 구하는 함수에, 배열로 전달해서 결과 구하기.

	}

}
