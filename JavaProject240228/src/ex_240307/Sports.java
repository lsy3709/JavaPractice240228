package ex_240307;

public class Sports {
	// 주제
	// Sport : 부모
	// 공통 멤버 변수 3개 -> 6개, 1) 이름 2) 인원수 3) 플레이 시간 4) 운동 장소
	// 5) 시즌 6) 등록날짜 
	 
	private String sportsName;
	private int sportsMemberCount;
	private String sportsPlayTime;
	private String sportsPlace;
	
	// 스포츠 개막 시즌
	// getter/setter 이용
	private Season season ;
	
	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	// 스포츠 등록시간 샘플
	// getter/setter 이용
	private String createTime;
	
	
	
	// 생성자를 안만들면, 매개변수 4개 짜리인 
	public Sports(String sportsName, int sportsMemberCount, String sportsPlayTime, String sportsPlace) {
		this.sportsName = sportsName;
		this.sportsMemberCount = sportsMemberCount;
		this.sportsPlayTime = sportsPlayTime;
		this.sportsPlace = sportsPlace;
	}
	
	// getter/ 구성.
	// setter -> 대신에, 매개변수 4개인 생성자에서, 미리 정보를 받는다. 
	// 그래서, 생략했음.
	
	public String getSportsName() {
		return sportsName;
	}
	
	public int getSportsMemberCount() {
		return sportsMemberCount;
	}
	
	public String getSportsPlayTime() {
		return sportsPlayTime;
	}
	
	public String getSportsPlace() {
		return sportsPlace;
	}
	
	
	
	// 공통 기능 : 3개, 
	public void showInfo() {
		System.out.print("스포츠 이름 : "+this.sportsName);
		System.out.print(", 인원수 : "+this.sportsMemberCount);
		System.out.println(", 플레이시간 : "+this.sportsPlayTime);
	}
	public void showPlayPlace() {
		System.out.println("운동 장소 : " + this.sportsPlace);
	}
	// 1) 이름, 인원수, 플레이 시간을 알려주는 기능 
	// 2) 운동 장소를 알려주는 기능
	// Enum 로 문자열로 만들기, 상수처럼. 
	
	
	// 3) 개막일 시즌별 (봄, 여름, 가을 , 겨울) 
	
	
	// Swimming : 자식
	// Baseball : 자식2 

}
