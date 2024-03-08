package ex_240308;

import java.util.Vector;

public class Ex_06_Collection_Vector_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 벡터, 의 -> 1번 리스트 ->2번 컬렉션,
		// 1번, 2번의 기능을 모두 상속 받았다.
		// 크기는 가변이다. 추가, 삭제, 검색등 자유롭게 사용이 가능하다.
		// 선언 했고, 크기는 따로 지정 할 필요는 없음. 가변으로 자동 크기 조정 됨.
		Vector<String> v1 = new Vector<String>();

		// 추가
		v1.add("사과");
		v1.add("바나나");
		v1.add("포도");

		// 출력 , 반복문
		System.out.println("기본 vector의 모든 요소 :");
		for (String str : v1) {
			System.out.println("v1 벡터 출력: " + str);
		}

		// 삭제, 인덱스 바나나, 1에 해당
		v1.remove(1);

		// 출력 , 반복문
		System.out.println("삭제, 인덱스 바나나, 1에 해당 출력 :");
		for (String str : v1) {
			System.out.println("v1 벡터 출력: " + str);
		}

		// 반복문으로 10개 추가.
		for (int i = 0; i < 10; i++) {
			v1.add("상용" + i);
		}

		// 출력 , 반복문
		System.out.println("반복문으로 10개 추가 후, 출력 :");
		for (String str : v1) {
			System.out.println("v1 벡터 출력: " + str);
		}
		
		// boolean addAll(Collection<? extends e> c)
		// : 컬렉션 c의 모든 요소를 벡터의 맨뒤에 추가. 
		Vector<String> v2 = new Vector<String>();
		v2.add("광어회");
		v2.add("진로");
		v2.add("매운탕");
		
		// 한번에 통째로 다 넣기. 
		v1.addAll(v2);
		
		// 출력하기. 
		System.out.println("반복문으로 10개 추가 후, 출력 :");
		for (String str : v1) {
			System.out.println("v1 벡터 출력: " + str);
		}
		
		// boolean contains(Object o) 
		// : 벡터가 지정된 객체 o를 포함하고 있으면 true 리턴. 
		
		boolean isHotSpicySoup = v1.contains("매운탕");
		System.out.println("매운탕 존재 하니 : " + isHotSpicySoup);
		
		// int indexOf(Object o) :
		// o와 같은 첫 번째의 요소의 인덱스 리턴, 없으면 -1 리턴. 
		int hotSpicySoupIndex = v1.indexOf("매운탕");
		System.out.println("매운탕 위치의 인덱스 번호 : " + hotSpicySoupIndex);
		
		// 길이: size
		System.out.println("v1의 사이즈 : " + v1.size());

	}

}
