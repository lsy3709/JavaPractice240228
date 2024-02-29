package ex_240229;

public class Ex_7_Array_test2 {

	public static void main(String[] args) {
		int intArray[] = new int[5];
		// 반복문으로 해당 배열, 0이상 <100 미만의 랜덤 값으로, 요소에 값을 설정.
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random() * 100);
		}
		
		// 출력을 하는 함수를 호출. 
		System.out.println(" ========얕은 복사 예제 ========");
		System.out.println(" ========intArray ========");
		showArrayElement(intArray);
		// 얕은 복사, 예제, 원본의 값이 변경되면, copyArray도 영향을 받는다.
		System.out.println(" ========copyArray1 ========");
		
		// intArray 가 가리키는 메모리 위치의 주솟값만 복사를 해서, 
		// 동일한 값이 들어가 있는 위치만 공유를 하는 것. 
		
		int copyArray1[] = intArray;
		showArrayElement(copyArray1);
		// 얕은 복사 테스트 중, 값을 변경시 영향 받는것 보여주기. 
//		intArray[0] = 1000;
		
//		System.out.println(" ========intArray, intArray[0] = 1000; 변경 후 확인 ========");
		showArrayElement(intArray);
		// 얕은 복사, 예제, 원본의 값이 변경되면, copyArray도 영향을 받는다.
		System.out.println(" ========copyArray1 ========");
		showArrayElement(copyArray1);
		
		
		//깊은 복사, 예제, 원본의 값이 변경되면, copyArray도 영향을 안 받는다. 
		System.out.println(" ========깊은 복사 copyArray2 ========");
		int copyArray2[] = new int[5];
		copyArray2 = intArray.clone();
		
		// 값 변경하기.
		System.out.println(" ======값 변경 하기.intArray[0] = 1000; ==========");
		intArray[0] = 1000;
		System.out.println(" ======원본: 얕은 복사 후 값 변경시 동일한 값==========");
		showArrayElement(intArray);
		System.out.println(" ======복사본1 : 얕은 복사 후 값 변경시 동일한 값==========");
		showArrayElement(copyArray1);
		System.out.println(" ======복사본2 : 깊은 복사 후 값 변경시 동일안함==========");
		showArrayElement(copyArray2);

	}

	// 배열 요소 출력해주는 함수 만들기.
	// 매개변수로 , 배열을 받는 함수. 
	public static void showArrayElement(int array[]) {
		// 반복문으로 출력해보기
		for (int i = 0; i < array.length; i++) {
			System.out.println("intArray 의 값 조회 : " + array[i]);
		}

	}

}
