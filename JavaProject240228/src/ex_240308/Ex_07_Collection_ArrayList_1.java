package ex_240308;

import java.util.ArrayList;

public class Ex_07_Collection_ArrayList_1 {

	public static void main(String[] args) {
		// ArrayList -> 1)번 List ->2)번 Collection
		// 벡터와 동일하게 부모의 1번과 2번의 모든 기능을 다 상속.
		// 크기는 가변, 순서 있고, 중복 가능함.
		// 벡터와 다른점은 스레드 동기화 기능을 지원을 안함.
		// 추가, 삭제 , 검색등 유연하게 여러 요소들을 처리가 가능함.
		// 정의
		// 문법 : 주의사항, 타입이 기본형만 아니면 모두 가능.
		// ArrayList<타입> arrayList = new ArrayList<타입>();
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("우럭회");
		arrayList.add("카스");
		arrayList.add("라면");

		// 출력
		for (String str : arrayList) {
			System.out.println("arrayList 의 요소 값 : " + str);
		}

		// 삭제, 인덱스 1, 카스 삭제 후 출력.
		arrayList.remove(1);

		// 출력
		for (String str : arrayList) {
			System.out.println("삭제 후 , arrayList 의 요소 값 : " + str);
		}
		
		// 검색 기능 , 라면 검색 하기.
		System.out.println("라면 검색 결과 : " + arrayList.contains("라면"));
		
		

	}

}
