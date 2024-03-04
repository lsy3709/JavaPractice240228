package ex_240304;

import java.util.Scanner;

public class Ex_03_class_2_Idol2 {

	public static void main(String[] args) {
		// Idol 클래스 사용
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이돌 그룹명을 입력해주세요>>");
		String groupNameString = scanner.next();

		System.out.println("그룹은 몇명인가?>>");
		int groupMemberNumber = scanner.nextInt();

		System.out.println("아이돌 그룹멤버를 입력해주세요(예, 공백으로 구분해서 넣기)>>");
		String[] groupMember = new String[groupMemberNumber];
		for (int i = 0; i < groupMember.length; i++) {
			groupMember[i] = scanner.next();
		}

		System.out.println("대표 앨범 3개만 입력해주세요(예, 공백으로 구분해서 넣기)>>");
		String[] groupAlbum = new String[3];
		for (int i = 0; i < groupAlbum.length; i++) {
			groupAlbum[i] = scanner.next();
		}

		System.out.println("주요 활동 지역 3개만 입력해주세요(예, 공백으로 구분해서 넣기)>>");
		String[] areaActivity = new String[3];
		for (int i = 0; i < areaActivity.length; i++) {
			areaActivity[i] = scanner.next();
		}

		// Idol(String groupName, String[] groupMembers, String[] groupAlbums)
		// BTS
//		Idol idol = new Idol(groupNameString, groupMember, groupAlbum );
//		idol.introduceMember();
//		idol.introduceAlbum();
		
		// 블랙핑크라고 만들었고, 아이돌 클래스를 상속을 받았음. 
		// 사용하기. 
		BlackPink blackPink = new BlackPink(groupNameString, groupMember, groupAlbum, areaActivity);
		blackPink.introduceMember();
		blackPink.introduceAlbum();
		blackPink.infoActivityArea();
		scanner.close();

	}

}
