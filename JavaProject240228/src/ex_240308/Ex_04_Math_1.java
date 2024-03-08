package ex_240308;

import java.util.Random;

public class Ex_04_Math_1 {
	static int[] pickedNumber;

	public static void main(String[] args) {
		// Math , 수학 관련된 기능을 많이 제공하고,
		// 난수 발생하는 기능을 주로 많이 활용한다.
		// Math.random() : 0 이상 1미만의 실수를 랜덤하게 발생 시키고

		// 1 이상 47 미만, * 46 + 1
		int num = (int) (Math.random() * 46 + 1);
		System.out.println("랜덤한 정수 : " + num);

		// java.util.Random 제공
		// Random r = new Random();
		// r.nextInt(); 음수, 양수, 0 포함 정수범위 난수 발생.
		// r.nextInt(100); 0에서 99사이의 난수 발생.
		// 다른 패키지에 있어서, 임포트 하면됨. ctrl + shift + o
		Random r = new Random();
		// 범위가 0이상 3미만
		int randomNum = r.nextInt(3);
		System.out.println("Random으로 출력 난수: " + randomNum);

		// 로또 번호가 : 1 ~ 45
		// 6개로
		// 로또 번호 자동 생성기 만들어보기.
		// 1 이상 46 미만, * 45 + 1
		int num2 = (int) (Math.random() * 45 + 1);
		// 배열로
		pickedNumber = new int[6];
		// 난수 생성 메서드로 호출후, 배열에 담기
		// 그리고, 배열에 이미 숫자가 있다면, 분기문으로 처리하고,
		// 중복없이 , 번호 6개 뽑을 때 까지, 반복 처리 : while
		int countCheck = 0;
		int[] tempInt = new int[6];
		while (true) {
			if (countCheck == 6) {
				System.out.println("로또 번호 생성기 출력");
				for(int n:tempInt) {
					System.out.print(n + " ");
				}
				System.out.println();
				System.out.println("종료합니다.");				
				break;
			} else if (countCheck == 0) {

				int pickNumber = generateRandomNumber();
				// 중복 검사. true 중복, false 중복 아님.
				while (true) {
					if (!checkNumber(pickNumber, tempInt)) {
						tempInt[countCheck] = pickNumber;
						countCheck++;
						break;

					}
				}
			} else if (countCheck == 1) {
				int pickNumber = generateRandomNumber();
				// 중복 검사. true 중복, false 중복 아님.
				while (true) {
					if (!checkNumber(pickNumber, tempInt)) {
						tempInt[countCheck] = pickNumber;
						countCheck++;
						break;

					}
				}

			} else if (countCheck == 2) {
				int pickNumber = generateRandomNumber();
				// 중복 검사. true 중복, false 중복 아님.
				while (true) {
					if (!checkNumber(pickNumber, tempInt)) {
						tempInt[countCheck] = pickNumber;
						countCheck++;
						break;

					}
				}

			}

			else if (countCheck == 3) {
				int pickNumber = generateRandomNumber();
				// 중복 검사. true 중복, false 중복 아님.
				while (true) {
					if (!checkNumber(pickNumber, tempInt)) {
						tempInt[countCheck] = pickNumber;
						countCheck++;
						break;

					}
				}

			}
			
			else if (countCheck == 4) {
				int pickNumber = generateRandomNumber();
				// 중복 검사. true 중복, false 중복 아님.
				while (true) {
					if (!checkNumber(pickNumber, tempInt)) {
						tempInt[countCheck] = pickNumber;
						countCheck++;
						break;

					}
				}

			}
			
			else if (countCheck == 5) {
				int pickNumber = generateRandomNumber();
				// 중복 검사. true 중복, false 중복 아님.
				while (true) {
					if (!checkNumber(pickNumber, tempInt)) {
						tempInt[countCheck] = pickNumber;
						countCheck++;
						break;

					}
				}

			}
			
			else if (countCheck == 6) {
				int pickNumber = generateRandomNumber();
				// 중복 검사. true 중복, false 중복 아님.
				while (true) {
					if (!checkNumber(pickNumber, tempInt)) {
						tempInt[countCheck] = pickNumber;
						countCheck++;
						break;

					}
				}

			}
		} // while 문 종료 지점. 

	}

	// 랜덤하게 번호를 하나 뽑아 주는 메서드 ,
	public static int generateRandomNumber() {
		int randomNumber = (int) (Math.random() * 45 + 1);
		return randomNumber;

	}

	// 배열에서, 숫자가 중복이 되는지 여부를 확인하는 메서드.
	public static boolean checkNumber(int number, int[] array) {
		boolean numCheck = false;
		for (int i = 0; i < array.length; i++) {
			if (number == array[i]) {
				numCheck = true;
				break;
			}

		}
		return numCheck;

	}

}
