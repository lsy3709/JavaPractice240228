package ex_240307;

public interface Interface1 {
	// 인터페이스 설계 , 1) 상수 2) 추상메서드
	// 반드시 이 기능은 구현해야는 것들
	// 1) 실내 스포츠, 실외 스포츠 인지 알려주는 기능.
	// 2) 사용 하는 운동 아이템을 알려주는 기능.
	// 3) 팀명 또는 팀원 들을 알려주는 기능.
	void showInOutPlace(int checkInOutPlace);
	void showUseItems(String[] items);
	void showTeamNameOrMember(String[] TeamOrMembers);
	
	
}
