package ex_240307;

import java.time.LocalDate;

public class Util {
	
	//현재 날짜 등록 해주는 기능. 
	public static void showDate() {
		LocalDate currentDate = LocalDate.now();
		String createTime = currentDate.toString();
		System.out.println("등록 시간 : " + createTime);
	}
	
	public static void showSeason(Sports sports, int season) {
		switch (season) {
		case 1: {
			Season spring = Season.SPRING;
			sports.setSeason(spring);
			break;
		}
		case 2: {
			Season summer = Season.SUMMER;
			sports.setSeason(summer);
			break;
		}
		case 3: {
			Season fall = Season.FALL;
			sports.setSeason(fall);
			break;
		}
		case 4: {
			Season winter = Season.WINTER;
			sports.setSeason(winter);
			break;
		}
		default:
			System.out.println("1~4번을 선택 해주세요");
			break;
		}
		
		System.out.println("개막 시즌 : " + sports.getSeason());
		
	}

}
