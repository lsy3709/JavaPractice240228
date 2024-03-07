package ex_240307;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Sports swimming = new Swimming("수영", 8, "10분이내 추측", "부산 사직 아시아드");
		swimming.showInfo();
		swimming.showPlayPlace();
		// 시즌 설정.
//		Season summer = Season.SUMMER;
//		swimming.setSeason(summer);
//		System.out.println("수영 개막 시즌 : " + swimming.getSeason());
		// swimming is Sports , 상속 관계, 부모 타입으로 받아도 된다. 다형성. 
		Util.showSeason(swimming, 2);
		
		// 시간 설정. 
		// Date 타입 -> 문자열 타입 변환. 
//		LocalDate currentDate = LocalDate.now();
//		String createTime = currentDate.toString();
//		swimming.setCreateTime(createTime);
//		System.out.println("수영 등록 시간 : " + swimming.getCreateTime());
		Util.showDate();
		
		// 인터페이스에서 정의한 추상 메서드 사용. 
	//		void showInOutPlace(int checkInOutPlace);
	//		void showUseItems(String[] items);
	//		void showTeamNameOrMember(String[] TeamOrMembers);
		// 현재 다형성으로 부모 타입으로 받아서, 현재 보이는 메서드는 부모 만 보여요. 
		// 그래서, 다운캐스팅 
		Swimming swimming2 = (Swimming)swimming;
		// 다시, 메서드를 조회 해보면, 자식이 재정의한 메서드가 보임. 
		swimming2.showInOutPlace(1);
		// 수영 선수 소개 
		String [] members = {"상용","성언","상준","병건","관우","상현","동진","규원"};
		swimming2.showTeamNameOrMember(members);
		// 수영 아이템 소개 
		String [] itemStrings = {"수영모","수영복","수경","귓마개","오리발"};
		swimming2.showUseItems(itemStrings);
		
		System.out.println("===================================");
		//Baseball 인스턴스 만들기. 
		Sports baseball = new Baseball("야구", 9, "약 3시간 전후", "사직야구장");
		baseball.showInfo();
		baseball.showPlayPlace();
		Util.showDate();
		Util.showSeason(baseball, 1);
		

	}

}
