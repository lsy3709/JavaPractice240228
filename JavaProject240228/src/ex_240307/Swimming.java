package ex_240307;

public class Swimming extends Sports implements Interface1{

	public Swimming(String sportsName, int sportsMemberCount, String sportsPlayTime, String sportsPlace) {
		super(sportsName, sportsMemberCount, sportsPlayTime, sportsPlace);

	}

	@Override
	public void showInOutPlace(int checkInOutPlace) {
		if(checkInOutPlace == 1) {
			System.out.println("실내 스포츠입니다.");
		} else {
			System.out.println("실외 스포츠입니다.");
		}
		
	}

	@Override
	public void showUseItems(String[] items) {
		System.out.print("사용 장비 : ");
		for(String item :items) {
			System.out.print(", "+item);
		}
		
	}

	@Override
	public void showTeamNameOrMember(String[] TeamOrMembers) {
		System.out.print("팀명 및 팀원 소개 : ");
		for(String teamOrMembers :TeamOrMembers) {
			System.out.print(", "+teamOrMembers);
		}
		
	}
	// 자식 클래스이고, 
	// 부모 : Sports 
	// 인터페이스 : Interface1

}
