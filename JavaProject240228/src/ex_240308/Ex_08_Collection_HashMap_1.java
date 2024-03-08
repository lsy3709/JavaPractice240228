package ex_240308;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex_08_Collection_HashMap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HashMap, 키와값의 구조 형태로 이루어진, 컬렉션.
		// 요소로는 참조형으로 가지고 있다.
		// 가변 크기, 추가 , 수정, 삭제, 조회등 속도가 빠르다.
		// 문법
		// HashMap<타입, 타입> hashMap = new HashMap<타입, 타입>();
		HashMap<String, String> hashMap = new HashMap<String, String>();

		// 추가.
		hashMap.put("apple", "사과");
		hashMap.put("banana", "바나나");
		hashMap.put("grape", "포도");

		// 출력.
		System.out.println("hashMap[\"apple\"] : " + hashMap.get("apple"));

		// 반복문 으로 변경, 앞에서 배웠던 iterator를 이용해서 출력 해보기.
		// 맵이 가지고 있는 모든 키를 조회.
		// 집합이라는 컬렉션에 키들을 다 모아두기.
		Set<String> keys = hashMap.keySet();
		// 반복가능하게 만들어서, 순차 조회를 하기.
		// 순서1.
		Iterator<String> it = keys.iterator();
		// 순서2.
		while (it.hasNext()) {
			// 모든 키를 조회를 했고,
			String keyString = it.next();
			// 해당 키를 이용해서 값을 조회.
			String value = hashMap.get(keyString);
			System.out.println("key : " + keyString + " value: " + value);

		}

		// 제거 , 바나나
		// 문법 , remove(key) : 해당 키에 대응하는 값을 삭제한다.
		hashMap.remove("banana");

		System.out.println("=================삭제 후 출력. ");
		// 삭제 후 출력.
		Set<String> keys2 = hashMap.keySet();
		// 반복가능하게 만들어서, 순차 조회를 하기.
		// 순서1.
		Iterator<String> it2 = keys.iterator();
		// 순서2.
		while (it2.hasNext()) {
			// 모든 키를 조회를 했고,
			String keyString = it2.next();
			// 해당 키를 이용해서 값을 조회.
			String value = hashMap.get(keyString);
			System.out.println("key : " + keyString + " value: " + value);

		}

		// 키로 검색
		System.out.println("키에 대한 apple 존재 유무 : " + hashMap.containsKey("apple"));

		// 값로 검색
		System.out.println("값에 대한 사과 존재 유무 : " + hashMap.containsValue("사과"));

	}

}
