package ex_240308;

import java.util.ArrayList;
import java.util.Iterator;

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
		
		// 현재, ArrayList로 Iterator 인터페이스 타입으로 변환 뒤. 
		// 모든 요소를 확인 후, 조회하는 간단한 기능 구현. 
		// 문법: Iterator 인터페이스를 상속받은 컬렉션들은 , 해당 인스턴스에 기능으로 
		// iterator() 메소드를 모두 가지고 있고, 이것을 호출 하면 됩니다.
		// ArrayList에 있는 모든 요소를 it1 , 인스턴스에 다 들어가 있다.
		// 비유 하자면, 특정의 테이블에 1번, 2번, 순서대로 기록이 되어 있다. 
		// 우리는 순서대로 기록된 테이블 차례차례 순차 검색이 가능하다. 
		// 조회도 해보자. 
		
		// 순서1, arrayList 인스턴스에 포함된 iterator() 호출.
		Iterator<String> it1 = arrayList.iterator();
		// hasNext(), 해당 테이블의 1번 라인부터해서 존재 유무 : true, false  리턴.
		// 순서2, 존재 유무 확인. 
		while(it1.hasNext()) {
			// next();해당 값을 가지고 오는 역할.
			// 순서3, 값을 가져오기. 
			String string = it1.next();
			System.out.println("iterator 를 이용한 출력 : " + string);
		}
		
		

	}

}
