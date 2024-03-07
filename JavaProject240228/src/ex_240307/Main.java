package ex_240307;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Sports swimming = new Swimming("수영", 8, "10분이내 추측", "부산 사직 아시아드");
		swimming.showInfo();
		swimming.showPlayPlace();
		// 시즌 설정.
		Season summer = Season.SUMMER;
		swimming.setSeason(summer);
		System.out.println("수영 개막 시즌 : " + swimming.getSeason());
		
		// 시간 설정. 
		// Date 타입 -> 문자열 타입 변환. 
		LocalDate currentDate = LocalDate.now();
		String createTime = currentDate.toString();
		swimming.setCreateTime(createTime);
		System.out.println("수영 등록 시간 : " + swimming.getCreateTime());
		

	}

}
